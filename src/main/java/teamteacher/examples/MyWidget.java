package teamteacher.examples;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class MyWidget extends VBox {

    private final StringProperty buttonText = new SimpleStringProperty(this, "buttonText", "Default Text");

    public MyWidget() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MyWidget.fxml"));
        fxmlLoader.setRoot(this);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        fxmlLoader.<MyWidgetController>getController().initialize(buttonText);
    }

    public String getButtonText() {
        return buttonText.get();
    }

    public void setButtonText(String value) {
        buttonText.set(value);
    }

    public StringProperty buttonTextProperty() {
        return buttonText;
    }
}