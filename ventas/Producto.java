package ventas;
public class Producto {

    private int idProducto;
    private String nombreProducto;
    private double precio;
    private static int contadorProductos = 0;

    public Producto(String nombreProducto, double precio) {
        this.idProducto = ++contadorProductos;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return 
                "id Producto:" + idProducto +
                ", Nombre Producto:" + nombreProducto  +
                ", Precio:" + precio;
    }
}
    

