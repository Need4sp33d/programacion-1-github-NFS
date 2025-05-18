module co.edu.uniquindio.tiendita {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.tiendita to javafx.fxml;
    exports co.edu.uniquindio.tiendita;
}