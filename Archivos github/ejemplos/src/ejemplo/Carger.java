package ejemplo;

public enum Carger {
    ADMIN(1000),
    INGENIERIO(5000),
    AUXILIAR(200),
    SECRETARIO(250),
    MENSAJERO(300),
    OPERARIO(500);

    private final int sueldo;

    private Carger(int sueldo) {
        this.sueldo = sueldo;
    }
}
