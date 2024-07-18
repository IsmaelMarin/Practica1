package ventas;

public class Cliente {
    private int idCliente;
    private String nombreCliente;
    private TipoPago tipoPago;
    private static int contadorClientes = 0;

    public Cliente(String nombreCliente, TipoPago tipoPago) {
        this.idCliente = ++contadorClientes;
        this.nombreCliente = nombreCliente;
        this.tipoPago = tipoPago;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    @Override
    public String toString() {
        return 
                "Id Cliente:" + idCliente +
                ", Nombre Cliente:" + nombreCliente +
                ", Tipo de Pago:" + tipoPago;
    }
}

