package com.example.largeclass.code_smell;

public class Usuario {
    private String id;
    private String nombre;

    public Usuario(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
