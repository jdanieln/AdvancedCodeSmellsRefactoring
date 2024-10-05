package com.example.largeclass.code_smell;

public class Pedido {
    private String id;
    private Usuario usuario;
    private Producto producto;
    private int cantidad;

    public Pedido(String id, Usuario usuario, Producto producto, int cantidad) {
        this.id = id;
        this.usuario = usuario;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
}
