package factura1;

import java.text.DecimalFormat;

public class Producto {
    private String nombre;
    private int cantidad;
    private double precio;
     
    /**
     * Constructor por defecto
     * @param cantidad
     * @param precio
     */
    public Producto(String nombre,int cantidad, double precio){
        this.nombre =nombre;
        this.cantidad=cantidad;
        this.precio=precio;
    }
 
    public String getNombre() {
        return nombre;
    }
    
    public int getCantidad() {
        return cantidad;
    }
 
    /**
     * Devuelve el precio
     * @return Precio del producto
     */
    public double getPrecio() {
        return precio;
    }
 
    /**
     * Devuelve el precio final que tiene un producto
     * @return precio final
     */
    public double precioFinal(){
         
        //Formateamos el precio final por problemas de precision
        DecimalFormat df=new DecimalFormat("#,##");
        return Double.parseDouble(df.format(this.precio * this.cantidad));
    }

}
