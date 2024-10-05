package com.example.duplicatecode.code_smell;

public class Producto {
    private String id;
    private String nombre;
    private int cantidad;

    public Producto(String id, String nombre, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }
}
