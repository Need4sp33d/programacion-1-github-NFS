package co.edu.uniquindio;
import java.time.LocalDate;
import java.util.LinkedList;

public class Batallon {
    private String nombre;
    private String id;

    private LinkedList<VehiculoApoyo> listVehiculosApoyo;
    private LinkedList<VehiculoBlindado> listVehiculosBlindados;
    private LinkedList<VehiculoTransporteTropas> listVehiculosTransporteTropas;
    private LinkedList<Soldado> listSoldados;
    private LinkedList<Mision> listMisiones;

    public Batallon(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;

        this.listVehiculosApoyo = new LinkedList<>();
        this.listVehiculosBlindados = new LinkedList<>();
        this.listVehiculosTransporteTropas = new LinkedList<>();
        this.listMisiones = new LinkedList<>();
    }
    public boolean registarSoldado(String nombre, Rango rango, Funcion funcion,Estado estado,int edad){
        boolean soldado = false;
        Soldado newSoldado = new Soldado(nombre, rango, funcion, estado, edad);
        return soldado;
    }
    public boolean registrarMision(LocalDate fechaMision, String ubicacionMision,
                                   LinkedList listPersonal, String idVehiculomision){
        boolean flag = false;

        //Convertir de int a string
        String cantMisionesActuales = String.valueOf(listMisiones.size()+1);

        Mision newMision = new Mision(cantMisionesActuales,fechaMision,ubicacionMision);

        return flag;
    }

    public LinkedList<Vehiculo> obtenerVehiculosCantMisiones() {
        LinkedList<Vehiculo> vehiculosMisionesCompletadas = new LinkedList<>();


        for (VehiculoApoyo vehiculo : listVehiculosApoyo) {
            if (vehiculo.getMisionesCompletadas() > 50){
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }

        for(VehiculoBlindado vehiculo : listVehiculosBlindados){
            if (vehiculo.getMisionesCompletadas() > 50){
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }

        for(VehiculoTransporteTropas vehiculo : listVehiculosTransporteTropas){
            if (vehiculo.getMisionesCompletadas() > 50){
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }

        return vehiculosMisionesCompletadas;
    }
}