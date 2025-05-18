package co.edu.uniquindio;

public abstract class VehiculoTransporteTropas extends Vehiculo {
    private int capacidadSoldados;

    public VehiculoTransporteTropas(String id, String modelo, int anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo,int misionesCompletadas, int capacidadSoldados) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo, misionesCompletadas);
        this.capacidadSoldados = capacidadSoldados;
    }

    // Getter y setter para capacidadSoldados

    @Override
    public String desplazar() {
        return "Capacidad: " + capacidadSoldados;
    }

    public int getCapacidadSoldados() {
        return capacidadSoldados;
    }

    public void setCapacidadSoldados(int capacidadSoldados) {
        this.capacidadSoldados = capacidadSoldados;
    }
}

