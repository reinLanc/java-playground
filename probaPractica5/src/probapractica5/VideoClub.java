/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probapractica5;

public class VideoClub {

    private Producto productos[];
    private Cliente clientes[];
    private Alquiler alquileres[];
    private int nextProducto;
    private int nextCliente;
    private int nextAlquiler;

    public VideoClub() {
        this.productos = new Producto[1000];
        this.clientes = new Cliente[1000];
        this.alquileres = new Alquiler[1000];
    }

    public void añadirProducto(Producto p) {
        productos[nextProducto] = p;
        nextProducto++;
    }

    public void añadirCliente(Cliente p) {
        clientes[nextCliente] = p;
        nextCliente++;
    }

    public void añadirAlquiler(Alquiler p) {
        alquileres[nextAlquiler] = p;
        nextAlquiler++;
    }

    public void listaProductos() {
        int i;

        for (i = 0; i < nextProducto; i++) {
            System.out.println(productos[i].mostrar());
        }
    }
    
    public void fichaProducto(int referencia)
    {
        int i;
        
        for (i = 0; i < nextProducto; i++) {
            if(referencia==productos[i].getReferencia())
                System.out.println(productos[i].mostrar());
        }        
    }
    
    public Producto localizarProducto(int referencia)
    {
        int i;
        
        for (i = 0; i < nextProducto; i++) {
            if(referencia==productos[i].getReferencia())
                return productos[i];
        }        
        return null;
    }    
    
    public void listaClientes() {
        int i;

        for (i = 0; i < nextCliente; i++) {
            System.out.println(clientes[i].mostrar());
        }        
    }    
    
    public void fichaCliente(int numero)
    {
        int i;
        
        for (i = 0; i < nextCliente; i++) {
            if(numero==clientes[i].getNumero()){
                System.out.println(clientes[i].mostrar());
                listadoAlquileresCliente(clientes[i]);
            }
        }        
    }    
    
    public Cliente localizarCliente(int numero)
    {
        int i;
        
        for (i = 0; i < nextCliente; i++) {
            if(numero==clientes[i].getNumero())
                return clientes[i];
        }        
        return null;
    }     
    
    public void listadoAlquileres() {
        int i;

        for (i = 0; i < nextAlquiler; i++) {
            System.out.println(alquileres[i].mostrar());
        }         
    }    
    
    public void listadoAlquileresCliente(Cliente c) {
        int i;

        for (i = 0; i < nextAlquiler; i++) {
            if(alquileres[i].cliente==c)
                System.out.println(alquileres[i].mostrarSoloProducto());
        }         
    }       

}

