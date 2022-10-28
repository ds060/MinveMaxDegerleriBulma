module com.example.minvemaxdegerleribulma {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.minvemaxdegerleribulma to javafx.fxml;
    exports com.example.minvemaxdegerleribulma;
}