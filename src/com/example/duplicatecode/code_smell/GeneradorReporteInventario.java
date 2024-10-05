package com.example.duplicatecode.code_smell;

import java.util.List;

public class GeneradorReporteInventario {
    public String generarReporteHTML(List<Producto> productos) {
        StringBuilder reporte = new StringBuilder();
        reporte.append("<html><body><h1>Reporte de Inventario</h1><table>");
        for (Producto producto : productos) {
            reporte.append("<tr><td>")
                   .append(producto.getId())
                   .append("</td><td>")
                   .append(producto.getNombre())
                   .append("</td><td>")
                   .append(producto.getCantidad())
                   .append("</td></tr>");
        }
        reporte.append("</table></body></html>");
        return reporte.toString();
    }
}
