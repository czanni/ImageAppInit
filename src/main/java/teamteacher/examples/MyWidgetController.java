package teamteacher.examples;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MyWidgetController {

    private final StringProperty buttonText = new SimpleStringProperty(this, "buttonText", "Default Text");

    @FXML
    public Button anotherButton;

    @FXML
    private Label label;

    @FXML
    private Button button;

    @FXML
    public void initialize(StringProperty buttonText) {
        // Initialization logic
        button.setOnAction(event -> handleButtonClick());

        anotherButton.textProperty().bind(buttonText);  // Bind the button text to the property
    }

    public void handleButtonClick() {
        label.setText("Button was clicked!");
    }

}