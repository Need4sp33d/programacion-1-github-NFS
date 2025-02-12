package Guarderia.rq2;

import javax.swing.*;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        pedirInformacionEstudiante();
    }
    public static void pedirInformacionEstudiante(){
        Estudiante[] listEstudiante = new Estudiante[10];

        for (int i = 0; i < listEstudiante.length; i++) {
            JOptionPane.showMessageDialog(null,"Ingrese la informacion del estudiante " + (i+1) + ":");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el edad del estudiante: "));
            String genero = JOptionPane.showInputDialog("Ingrese el genero del estudiante: ");
            String identificacion = JOptionPane.showInputDialog("Ingrese el documento del estudiante: ");
            String alergias = JOptionPane.showInputDialog("Ingrese las alergias: ");
            String acuediente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente: ");
            String telefono = JOptionPane.showInputDialog("Ingrese el numero del acudiente: ");

            Estudiante newEstudiante = new Estudiante(nombre, edad, genero, identificacion, alergias, acuediente, telefono);

            listEstudiante[i] = newEstudiante;
        }
    }
    public static void ejemploArreglo(){
        int n = 4;
        int[] arregloEdades = new int[n];

        String mensaje = "";

        for(int i = 0; i< arregloEdades.length; i++) {
            mensaje += arregloEdades[i] + " ";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
