package co.edu.uniquindio;
import java.util.Date;
import java.util.List;

public class Mision {
    private Date fecha;
    private String ubicacion;
    private List<String> personalAsignado;
    private List<Vehiculo> vehiculosUtilizados;

    public Mision(Date fecha, String ubicacion, List<String> personalAsignado, List<Vehiculo> vehiculosUtilizados) {
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.personalAsignado = personalAsignado;
        this.vehiculosUtilizados = vehiculosUtilizados;
    }
    public List<Vehiculo> getVehiculosUtilizados(){
        return this.vehiculosUtilizados;
    }
}