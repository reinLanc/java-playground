package ejerciciolibro13;

/**
 *
 * @author Reinaldo Gil
 */
public class Articulo {

    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    /**
     * Constructor de la clase Articulo
     */
    public Articulo(String codigo, String descripcion, double precioCompra,
            double precioVenta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getStock() {
        return stock;
    }

    // Setters
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Incrementa el stock del artículo
     */
    public void incrementarStock(int cantidad) {
        this.stock += cantidad;
    }

    /**
     * Decrementa el stock del artículo
     *
     * @return true si hay stock suficiente, false si no
     */
    public boolean decrementarStock(int cantidad) {
        if (this.stock >= cantidad) {
            this.stock -= cantidad;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-25s %8.2f€ %8.2f€ %5d",
                codigo, descripcion, precioCompra, precioVenta, stock);
    }
}
