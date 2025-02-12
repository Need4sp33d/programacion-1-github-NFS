package Guarderia.rq1;

public class Estudiante {
    private String nombre;
    private int edad;
    private String genero;
    private String TI;
    private String alergias;
    private String acudiente;
    private String telefono;
    public Estudiante(String nombre,int edad,String genero,String TI,String alergias,String acudiente,String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.TI = TI;
        this.alergias = alergias;
        this.acudiente = acudiente;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +"\n"+
                ", edad=" + edad +"\n"+
                ", genero='" + genero + '\''+"\n"+
                ", TI='" + TI + '\'' +"\n"+
                ", alergias='" + alergias + '\'' +"\n"+
                ", acudiente='" + acudiente + '\'' +"\n"+
                ", telefono='" + telefono + '\'' +"\n"+
                '}';
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTI() {
        return TI;
    }

    public void setTI(String TI) {
        this.TI = TI;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getAcudiente() {
        return acudiente;
    }

    public void setAcudiente(String acudiente) {
        this.acudiente = acudiente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
