package com.example.messagechains.code_smell;

public class Cliente {
    private Direccion direccion;

    public Cliente(Direccion direccion) {
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
