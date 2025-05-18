module co.edu.uniquindio.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.javafxdemo to javafx.fxml;
    exports co.edu.uniquindio.javafxdemo;
}