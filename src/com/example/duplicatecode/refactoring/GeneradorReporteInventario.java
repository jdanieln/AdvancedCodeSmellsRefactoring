package com.example.duplicatecode.refactoring;

import java.util.List;

public class GeneradorReporteInventario {
    private GeneradorReporte generadorReporte = new GeneradorReporte();

    public String generarReporteHTML(List<Producto> productos) {
        return generadorReporte.generarReporteHTML("Reporte de Inventario", productos, producto ->
            "<tr><td>" + producto.id() + "</td><td>" + producto.nombre() + "</td><td>" + producto.cantidad() + "</td></tr>"
        );
    }
}
