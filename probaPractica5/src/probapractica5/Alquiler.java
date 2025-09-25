
package probapractica5;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Alquiler {
    Cliente cliente;
    Producto producto;
    Date fecha;
    Date devolucion;
    float importe;

    public Alquiler(Cliente cliente, Producto producto, Date fecha, Date devolucion, float importe) {
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.devolucion = devolucion;
        this.importe = importe;
    }
    
    public String mostrar()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return cliente.mostrar()+
               producto.mostrar()+
               "\nFecha alquiler: "+sdf.format(fecha)+
               "\nFecha devolucion: "+sdf.format(devolucion)+
               "\nImporte: "+importe;
    }    
    
    public String mostrarSoloProducto()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return producto.mostrar()+
               "\nFecha alquiler: "+sdf.format(fecha)+
               "\nFecha devolucion: "+sdf.format(devolucion)+
               "\nImporte: "+importe;
    }      
}

