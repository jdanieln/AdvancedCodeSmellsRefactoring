package com.example.messagechains.refactoring;

public class Main {
    public static void main(String[] args) {
        Ciudad ciudad = new Ciudad("Madrid");
        Direccion direccion = new Direccion(ciudad);
        Cliente cliente = new Cliente(direccion);

        String nombreCiudad = cliente.getNombreCiudad();
        System.out.println("Ciudad del cliente: " + nombreCiudad);
    }
}
