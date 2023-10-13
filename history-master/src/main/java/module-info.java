module com.example.hust{
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.annotation;
    requires com.google.gson;
    requires com.fasterxml.jackson.databind;
    requires org.json;
    requires org.jsoup;
    requires asciitable;


    opens com.test3 to javafx.fxml;
    exports com.test3;
    exports com.controll;
    opens com.controll to javafx.fxml;
}