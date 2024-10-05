package com.example.messagechains.refactoring;

public record Cliente(Direccion direccion) {
    public String getNombreCiudad() {
        return direccion.getNombreCiudad();
    }
}
