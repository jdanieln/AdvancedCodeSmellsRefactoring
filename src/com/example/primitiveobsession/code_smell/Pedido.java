package com.example.primitiveobsession.code_smell;

public class Pedido {
    private String numeroPedido;
    private String codigoProducto;
    private String codigoCliente;
    private int cantidad;

    public Pedido(String numeroPedido, String codigoProducto, String codigoCliente, int cantidad) {
        this.numeroPedido = numeroPedido;
        this.codigoProducto = codigoProducto;
        this.codigoCliente = codigoCliente;
        this.cantidad = cantidad;
    }

    // Métodos adicionales
}
