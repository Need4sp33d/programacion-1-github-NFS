package co.edu.uniquindio;
import java.util.LinkedList;
import java.util.List;

public class Batallon {
    private List<Vehiculo> vehiculos;
    private List<Mision> misiones;

    public Batallon() {
        this.vehiculos = new LinkedList<>(); // Usando LinkedList
        this.misiones = new LinkedList<>(); // Usando LinkedList
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void registrarMision(Mision mision) {
        misiones.add(mision);
        for (Vehiculo vehiculo : mision.getVehiculosUtilizados()) {
            vehiculo.agregarMision();
        }
    }

    public List<Vehiculo> obtenerVehiculosParaReemplazo() {
        List<Vehiculo> vehiculosParaReemplazo = new LinkedList<>(); // Usando LinkedList
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getCantidadMisiones() > 50) {
                vehiculosParaReemplazo.add(vehiculo);
            }
        }
        return vehiculosParaReemplazo;
    }
}