package com.example.messagechains.code_smell;

public class Direccion {
    private Ciudad ciudad;

    public Direccion(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }
}
