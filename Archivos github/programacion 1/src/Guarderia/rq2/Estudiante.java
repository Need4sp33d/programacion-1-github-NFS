package Guarderia.rq2;

public class Estudiante {
    private String nombre;
    private int edad;
    private String genero;
    private String identificacion;
    private String alergias;
    private String acudiente;
    private String telefono;
    public Estudiante(String nombre,int edad,String genero,String identificacion,String alergias,String acudiente,String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.identificacion = identificacion;
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
                ", identificacion='" + identificacion + '\'' +"\n"+
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

    public String getIdentificacion() {
        return identificacion;
    }

    public void setTI(String Identificacion) {
        this.identificacion = identificacion;
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
