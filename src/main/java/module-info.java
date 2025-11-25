module com.example.floconmigon {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.graphics;


    opens com.example.floconmigon to javafx.fxml;
    exports com.example.floconmigon;
}