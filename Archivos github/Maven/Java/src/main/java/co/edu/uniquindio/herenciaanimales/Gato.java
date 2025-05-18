package co.edu.uniquindio.herenciaanimales;

public class Gato extends Animal {
    private boolean pelaje;
    private String tipoAlementacion;

    public Gato(int cantPatas, String nombre, String especie, boolean pelaje, String tipoAlementacion) {
        super(cantPatas, nombre, especie);
        this.pelaje = pelaje;
        this.tipoAlementacion = tipoAlementacion;

    }
    @Override
    public void ruido(){
        System.out.println();
    }
}
