package com.example.duplicatecode.code_smell;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Datos de ventas
        List<Venta> ventas = Arrays.asList(
            new Venta("V001", 1500.0),
            new Venta("V002", 2300.0)
        );

        GeneradorReporteVentas generadorVentas = new GeneradorReporteVentas();
        String reporteVentas = generadorVentas.generarReporteHTML(ventas);
        System.out.println(reporteVentas);

        // Datos de productos
        List<Producto> productos = Arrays.asList(
            new Producto("P001", "Laptop", 10),
            new Producto("P002", "Smartphone", 20)
        );

        GeneradorReporteInventario generadorInventario = new GeneradorReporteInventario();
        String reporteInventario = generadorInventario.generarReporteHTML(productos);
        System.out.println(reporteInventario);
    }
}
