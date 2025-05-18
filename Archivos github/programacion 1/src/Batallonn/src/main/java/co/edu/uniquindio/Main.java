package co.edu.uniquindio;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Batallon batallon = new Batallon();

        // Crear un vehículo blindado
        VehiculoBlindado blindado1 = new VehiculoBlindado("VB001", "Modelo B", 2018, 5000, "En Misión", "Nivel 3");
        batallon.agregarVehiculo(blindado1);

        // Crear misiones y asignar el vehículo blindado
        Mision mision1 = new Mision(new Date(), "Zona X", Arrays.asList("Soldado 1", "Soldado 2"), Arrays.asList(blindado1));
        Mision mision2 = new Mision(new Date(), "Zona Y", Arrays.asList("Soldado 3", "Soldado 4"), Arrays.asList(blindado1));
        Mision mision3 = new Mision(new Date(), "Zona Z", Arrays.asList("Soldado 5", "Soldado 6"), Arrays.asList(blindado1));

        // Registrar misiones
        batallon.registrarMision(mision1);
        batallon.registrarMision(mision2);
        batallon.registrarMision(mision3);

        // Mostrar información del vehículo blindado y sus misiones
        System.out.println("Información del vehículo blindado:");
        System.out.println(blindado1);
        System.out.println("Cantidad de misiones completadas: " + blindado1.getCantidadMisiones());
    }
}