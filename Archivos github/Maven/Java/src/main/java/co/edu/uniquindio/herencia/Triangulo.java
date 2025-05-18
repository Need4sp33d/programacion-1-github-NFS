package co.edu.uniquindio.herencia;

public class Triangulo extends FiguraGeometricas {

    public Triangulo(int cantLados) {
        super(cantLados);
    }

    @Override
    public void cantLados() {
        System.out.println("El triangulo : "cantLados" ");
    }
}
