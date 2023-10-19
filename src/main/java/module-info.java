module com.jakubku.hbox.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jakubku.hbox.demo to javafx.fxml;
    exports com.jakubku.hbox.demo;
}