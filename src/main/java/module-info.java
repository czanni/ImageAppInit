module teamteacher {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;
    requires java.rmi;
    requires javafx.swing;

    opens teamteacher.examples to javafx.fxml;
    exports teamteacher.examples;
}
