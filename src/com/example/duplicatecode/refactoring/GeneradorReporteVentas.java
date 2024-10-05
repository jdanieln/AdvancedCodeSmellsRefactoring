package com.example.duplicatecode.refactoring;

import java.util.List;

public class GeneradorReporteVentas {
    private GeneradorReporte generadorReporte = new GeneradorReporte();

    public String generarReporteHTML(List<Venta> ventas) {
        return generadorReporte.generarReporteHTML("Reporte de Ventas", ventas, venta ->
            "<tr><td>" + venta.id() + "</td><td>" + venta.monto() + "</td></tr>"
        );
    }
}
