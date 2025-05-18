package tallerEmpresa;

public class Empresa {
    private String nombre;
    private String nit;
    private Empleado[] listEmpleado;

    public Empresa(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.listEmpleado = new Empleado[50];
    }
    public Empleado[] buscarEmpleadoCargo(String cargoEmpleado) {
        int cantEmpleadosCargo = 0;
        for (int i = 0; i < listEmpleado.length; i++) {
            if (listEmpleado[i].getCargo().equals(cargoEmpleado))
                    cantEmpleadosCargo++;
        }
        Empleado[] listEmpleadosCargo = new Empleado[cantEmpleadosCargo];
        int indice = 0;

        for (int i = 0; i < listEmpleado.length; i++) {
            if (listEmpleado[i].getCargo().equals(cargoEmpleado)){
                listEmpleadosCargo[indice] = listEmpleado[i];
                indice++;
            }
        }
        return listEmpleadosCargo;
    }
    public double determinarSalarioAlto{
          Empleado[] listSalarioAlto = obtenerListNoNull(listEmpleados);
              for (int i = 0; i < listSalarioAlto.length; i++){
                  for (int j = 0;j < listSalarioAlto.length; j++){
                      if(listSalario[i].getSalario < listSalarioAlto[j].getSalario){
                          empleado auxiliar = listSalarioAlto[j];
                              listSalarioAlto[j] = listSalarioAlto[i];
                              listSalarioAlto[i] = auxiliar;
                      }

                  }
              }
        return listSalarioAlto
    }
    public boolean actulizarEmpleado(String idEmpleadoModificar, Empleado empleadomodificado) {
        int posicionEmpleadoModificar = buscarEmpleadoID(idEmpleadoModificar);
        if (posicionEmpleadoModificar == -1) {
            listEmpleado[posicionEmpleadoModificar] = empleadomodificado;
            return true;
        }
        return false;
    }

    public boolean crearEmpleado(Empleado newEmpleado) {
        int espacioLibre = validarCupoEmpleado();

        if(espacioLibre != -1 &&
                buscarEmpleadoID(newEmpleado.getCedula()) == -1) {
            listEmpleado[espacioLibre] = newEmpleado;
            return true;
        }
        return false;
    }

    public boolean eliminarEmpleado(String idEmpleadoEliminar) {
        int posicionEmpleadoEliminar = buscarEmpleadoID(idEmpleadoEliminar);

        if (posicionEmpleadoEliminar != -1) {
            listEmpleado[posicionEmpleadoEliminar] = null;
            return true;
        }
        return false;
    }

    public int buscarEmpleadoID(String idEmpleadoBuscar) {
        for (int i = 0; i < listEmpleado.length; i++) {
            if (listEmpleado[i].getCedula().equals(idEmpleadoBuscar)) {
                return i;
            }
        }
        return -1;
    }
    public int validarCupoEmpleado(){
        for (int i = 0; i < listEmpleado.length; i++) {
            if (listEmpleado[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    public Empleado[] getListEmpleado() {
        return listEmpleado;
    }
    public void setListEmpleado(Empleado[] listEmpleado) {
        this.listEmpleado = listEmpleado;
    }
}
