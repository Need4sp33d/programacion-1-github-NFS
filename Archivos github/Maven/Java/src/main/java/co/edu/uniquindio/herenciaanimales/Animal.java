package co.edu.uniquindio.herenciaanimales;

public class Animal {
    public int cantPatas;
    public String especie;
    public String nombre;

    public void ruido(){
        System.out.println("El animal hace ruido");
    }

    public Animal(int cantPatas, String especie, String nombre) {
        this.cantPatas = cantPatas;
        this.especie = especie;
        this.nombre = nombre;
    }
}
