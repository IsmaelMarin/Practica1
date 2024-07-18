package ventas;

import java.util.Date;

public class Orden {
    private int idOrden;
    private Producto[] productos;
    private Cliente cliente;
    private Date fecha;
    private static int contadorOrdenes = 0;
    private int contadorProductos = 0;
    private static final int MAX_PRODUCTOS = 10;

    public Orden(Cliente cliente) {
        this.idOrden = ++contadorOrdenes;
        this.productos = new Producto[MAX_PRODUCTOS];
        this.cliente = cliente;
        this.fecha = new Date();
    }

    public void agregarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto producto) {
        if (contadorProductos < MAX_PRODUCTOS) {
            this.productos[contadorProductos++] = producto;
        } else {
            System.out.println("No se pueden agregar más productos a la orden.");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Orden #" + idOrden);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente);
        System.out.println("Productos:");
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println(productos[i]);
        }
        System.out.println("Total: " + calcularTotal());
    }
}
