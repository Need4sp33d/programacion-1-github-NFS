package Empleado;

public class Empleado {
    private String nombre;
    private String id;
    private String puesto;
    private String correo;
    private String telefono;
    private String fechaContracion;

    public Empleado(String nombre, String id, String puesto, String correo, String telefono, String fechaContracion) {
        this.nombre = nombre;
        this.id = id;
        this.puesto = puesto;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaContracion = fechaContracion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getFechaContracion() {
        return fechaContracion;
    }
    public void setFechaContracion(String fechaContracion) {
        this.fechaContracion = fechaContracion;
    }
}
