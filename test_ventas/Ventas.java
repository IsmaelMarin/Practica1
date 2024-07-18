package test_ventas;

import ventas.Cliente;
import ventas.Orden;
import ventas.Producto;
import ventas.TipoPago;

public class Ventas {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan Pérez", TipoPago.CONTADO);
        Orden orden1 = new Orden(cliente1);
        
        Producto producto1 = new Producto("Laptop", 1200.99);
        Producto producto2 = new Producto("Mouse", 25.50);
        
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        
        orden1.mostrarOrden();
    }
}
