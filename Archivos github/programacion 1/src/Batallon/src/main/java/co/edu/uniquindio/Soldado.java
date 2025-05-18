package co.edu.uniquindio;

public class Soldado {
    private String nombre;
    private Rango rango;
    private Funcion funcion;
    private Estado estado;
    private int edad;

    public Soldado(String nombre, Rango rango, Funcion funcion,Estado estado, int edad) {
        this.nombre = nombre;
        this.rango = rango;
        this.funcion = funcion;
        this.estado = estado;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rango getRango() {
        return rango;
    }

    public void setRango(Rango rango) {
        this.rango = rango;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
