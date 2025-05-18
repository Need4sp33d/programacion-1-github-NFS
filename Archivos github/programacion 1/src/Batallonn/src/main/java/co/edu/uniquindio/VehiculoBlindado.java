package co.edu.uniquindio;

public class VehiculoBlindado extends Vehiculo {
    private String nivelBlindaje;

    public VehiculoBlindado(String id, String modelo, int anioFabricacion, double kilometraje, String estadoOperativo, String nivelBlindaje) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo);
        this.nivelBlindaje = nivelBlindaje;
    }

    // Getter y setter para nivelBlindaje

    @Override
    public String obtenerInformacionAdicional() {
        return "Blindaje: " + nivelBlindaje;
    }

    public String getNivelBlindaje() {
        return nivelBlindaje;
    }

    public void setNivelBlindaje(String nivelBlindaje) {
        this.nivelBlindaje = nivelBlindaje;
    }
}