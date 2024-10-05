package com.example.messagechains.refactoring;

public record Direccion(Ciudad ciudad) {
    public String getNombreCiudad() {
        return ciudad.nombre();
    }
}
