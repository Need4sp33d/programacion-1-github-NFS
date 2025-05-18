package co.edu.uniquindio;

public class VehiculoApoyo extends Vehiculo{
    private TipoFuncion tipoFuncion; // Logística, Comunicaciones, Médico

    public VehiculoApoyo(String id, String modelo, int anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo, int misionesCompletadas, TipoFuncion tipoFuncion) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo, misionesCompletadas);
        this.tipoFuncion = tipoFuncion;
    }

    // Getter y setter para tipoFuncion

    @Override
    public String desplazar() {
        return "Función: " + tipoFuncion;
    }

    public TipoFuncion getTipoFuncion() {
        return tipoFuncion;
    }

    public void setTipoFuncion(TipoFuncion tipoFuncion) {
        this.tipoFuncion = tipoFuncion;
    }
}