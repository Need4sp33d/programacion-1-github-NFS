package co.edu.uniquindio;

import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Batallon batallon = new Batallon("la le li lo lu","524k3");
        cargarDatos(Batallon);

        String[] opciones = {
                "Mision"
                "Soldado"
                "Vehiculo"
                "Salir"
        };
        While (true) {
            String opcionSelecionada = (String) JOptionPane.showInputDialog(
                    null,
                    "selecione una accion: ",
                    "menu inicio",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);
            if(opcionSelecionada == null || opcionSelecionada.equals("Salir")) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                break;
            }
            switch (opcionSeleccionada) {
                case "Mision":
                    misionCRUD(Batallon);
                    break;
                case "Soldado":
                    soldadoCRUD(Batallon);
                    break;
                case "Vehiculo":
                    vehiculoCRUD(Batallon);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida, intente de nuevo.");
            }
        }

    }
    private static void misionCRUD(Batallon batallon) {
        
    }
}