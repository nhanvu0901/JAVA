module com.example.joenix {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.joenix to javafx.fxml;
    exports com.example.joenix;
}