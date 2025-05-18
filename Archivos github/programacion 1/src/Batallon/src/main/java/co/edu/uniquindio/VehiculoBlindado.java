package co.edu.uniquindio;

public class VehiculoBlindado extends Vehiculo {
    private String nivelBlindaje;

    public VehiculoBlindado(String id, String modelo, int anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo,int misionesCompletadas, String nivelBlindaje) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo, misionesCompletadas);
        this.nivelBlindaje = nivelBlindaje;
    }

    // Getter y setter para nivelBlindaje

    @Override
    public String desplazar() {
        return "Blindaje: " + nivelBlindaje;
    }

    public String getNivelBlindaje() {
        return nivelBlindaje;
    }

    public void setNivelBlindaje(String nivelBlindaje) {
        this.nivelBlindaje = nivelBlindaje;
    }
}

