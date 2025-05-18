package co.edu.uniquindio;

public abstract class Vehiculo {
    protected String id;
    protected String modelo;
    protected int anioFabricacion;
    protected double kilometraje;
    protected String estadoOperativo; // Disponible, En Misión, En Mantenimiento
    protected int cantidadMisiones;

    public Vehiculo(String id, String modelo, int anioFabricacion, double kilometraje, String estadoOperativo) {
        this.id = id;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
        this.estadoOperativo = estadoOperativo;
        this.cantidadMisiones = 0;
    }

    // Getters y setters para los atributos

    public void agregarMision() {
        this.cantidadMisiones++;
    }

    public int getCantidadMisiones() {
        return cantidadMisiones;
    }

    public abstract String obtenerInformacionAdicional();

    @Override
    public String toString() {
        return "ID: " + id + ", Modelo: " + modelo + ", Año: " + anioFabricacion + ", Kilometraje: " + kilometraje + ", Estado: " + estadoOperativo + ", " + obtenerInformacionAdicional();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(String estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }

    public void setCantidadMisiones(int cantidadMisiones) {
        this.cantidadMisiones = cantidadMisiones;
    }
}
