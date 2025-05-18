package parcial1.Tienda;

public class Main {
//Metodo obtener prductos ente 30k y 50k
    public Productos[] obtenerproductosEntrePrecio(){
        Producto[] obtenerProductoEntrPrecio;
        int tamListProd = 0;

        for(int i=0; i<listProductos.length; i++){
            if(listProductos[i].getPrecio > 30000 && listProductos[i].getPrecio < 55000){
                tamListProd++;
            }
        }

        listProductosEntrePrecio = new Producto[tamListProd];
        int indice = 0;

        for(int i=0; i<listProductos.length; i++){
            if(listProductos[i].getPrecio > 30000 && listProductos[i].getPrecio < 55000) {
                listProductosEntrePrecios[indice] = listProductos
                indice++;
            }
    }
    public cliente[] obtenerClienteCompraTV(){
            cliente[] listClienteCompra;
            int tamListCliente = 0;

            for(int i=0<listClientes.length ;i++){
                Cliente ClienteIteracion = lisClientes[i];
                for(int j=0; j<ClienteIteracion[i].getListaVentasCliente().length; j++){
                    for(int k=0; k<listClientes[i].getListaventasClientes[j].getListaDetallesVenta().length; k++){
                        Detalle newDetalle = listClientes[i].getListaVentasCliente[j].getListaDetallesVenta[]

                        if(newDetalle.getCantidad == 2 && newDetalle.getProducto().getNombre(),equals("TV")){
                            listClientCompra[indice] = clienteIteracion;
                            indice++;
                        }
                    }
                }
            }
        }
    public Cliente clienteMayorCompras(){
            Cliente clienteMayor;
            int cantComprasMayorCliente = 0

            for(int i = 0; i<listClientes.lenght; i++){
                if(listClientes[i].getListVentasCliente().lenght > cantComprasMayorCliente){
                    cantComprasMayorCliente = listClientes[i].getListVentasCliente().length;
                    clienteMayor = listClientes[i];
                }
            }
            return clienteMayor
        }
}
