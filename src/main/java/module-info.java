module com.example.floconmigon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.floconmigon to javafx.fxml;
    exports com.example.floconmigon;
}