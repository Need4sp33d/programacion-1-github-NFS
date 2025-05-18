module co.edu.uniquindio.javafxtestnoche {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.javafxtestnoche to javafx.fxml;
    exports co.edu.uniquindio.javafxtestnoche;
}