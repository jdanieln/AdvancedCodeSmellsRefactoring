package com.example.largeclass.code_smell;

public class Producto {
    private String id;
    private String nombre;
    private int cantidad;

    public Producto(String id, String nombre, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
