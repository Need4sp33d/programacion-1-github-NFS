package Guarderia.rq1;

import javax.swing.*;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

        int n = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de estudiantes: "));

        for (int i = 0; i < n; i++) {

            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el edad del estudiante: "));
            String genero = JOptionPane.showInputDialog("Ingrese el genero del estudiante: ");
            String TI = JOptionPane.showInputDialog("Ingrese el documento del estudiante: ");
            String alergias = JOptionPane.showInputDialog("Ingrese las alergias: ");
            String acuediente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente: ");
            String telefono = JOptionPane.showInputDialog("Ingrese el numero del acudiente: ");

            Estudiante newEstudiante = new Estudiante(nombre, edad, genero, TI, alergias, acuediente, telefono);

            listaEstudiantes.add(newEstudiante);
            JOptionPane.showMessageDialog(null, newEstudiante);
        }
    }
}
