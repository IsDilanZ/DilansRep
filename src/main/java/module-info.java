module com.example.mifirstproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mifirstproject to javafx.fxml;
    exports com.example.mifirstproject;
}