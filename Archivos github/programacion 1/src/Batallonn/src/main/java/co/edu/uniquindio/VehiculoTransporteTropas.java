package co.edu.uniquindio;

public class VehiculoTransporteTropas extends Vehiculo {
    private int capacidadSoldados;

    public VehiculoTransporteTropas(String id, String modelo, int anioFabricacion, double kilometraje, String estadoOperativo, int capacidadSoldados) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo);
        this.capacidadSoldados = capacidadSoldados;
    }

    // Getter y setter para capacidadSoldados

    @Override
    public String obtenerInformacionAdicional() {
        return "Capacidad: " + capacidadSoldados;
    }

    public int getCapacidadSoldados() {
        return capacidadSoldados;
    }

    public void setCapacidadSoldados(int capacidadSoldados) {
        this.capacidadSoldados = capacidadSoldados;
    }
}
