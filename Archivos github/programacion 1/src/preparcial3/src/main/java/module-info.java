module co.edu.uniquindio.preparcial3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.preparcial3 to javafx.fxml;
    exports co.edu.uniquindio.preparcial3;
}