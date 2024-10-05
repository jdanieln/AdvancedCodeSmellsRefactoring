package com.example.messagechains.code_smell;

public class Main {
    public static void main(String[] args) {
        Ciudad ciudad = new Ciudad("Madrid");
        Direccion direccion = new Direccion(ciudad);
        Cliente cliente = new Cliente(direccion);

        // Cadena de mensajes
        String nombreCiudad = cliente.getDireccion().getCiudad().getNombre();
        System.out.println("Ciudad del cliente: " + nombreCiudad);
    }
}
