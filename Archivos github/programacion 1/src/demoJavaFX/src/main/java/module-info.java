module co.edu.uniquindio.demojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.demojavafx to javafx.fxml;
    exports co.edu.uniquindio.demojavafx;
}