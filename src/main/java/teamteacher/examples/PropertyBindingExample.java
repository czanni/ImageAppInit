package teamteacher.examples;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

class User {
    private final StringProperty name = new SimpleStringProperty();

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public StringProperty nameProperty() {
        return name;
    }
}

public class PropertyBindingExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        User user = new User();

        // Create UI elements
        TextField nameField = new TextField();
        Label nameLabel = new Label("Name:");

        // Bind the TextField to the User's name property
        nameField.textProperty().bindBidirectional(user.nameProperty());

        // Display the user's name when it changes
        user.nameProperty().addListener((observable, oldValue, newValue) -> {
            nameLabel.setText("Name: " + newValue);
        });

        // Layout
        VBox layout = new VBox(10, nameLabel, nameField);
        Scene scene = new Scene(layout, 300, 200);

        primaryStage.setTitle("Binding Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
