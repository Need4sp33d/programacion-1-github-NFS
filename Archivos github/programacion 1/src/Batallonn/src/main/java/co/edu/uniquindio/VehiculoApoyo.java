package co.edu.uniquindio;

public class VehiculoApoyo extends Vehiculo {
    private String tipoFuncion; // Logística, Comunicaciones, Médico

    public VehiculoApoyo(String id, String modelo, int anioFabricacion, double kilometraje, String estadoOperativo, String tipoFuncion) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo);
        this.tipoFuncion = tipoFuncion;
    }

    // Getter y setter para tipoFuncion

    @Override
    public String obtenerInformacionAdicional() {
        return "Función: " + tipoFuncion;
    }

    public String getTipoFuncion() {
        return tipoFuncion;
    }

    public void setTipoFuncion(String tipoFuncion) {
        this.tipoFuncion = tipoFuncion;
    }
}