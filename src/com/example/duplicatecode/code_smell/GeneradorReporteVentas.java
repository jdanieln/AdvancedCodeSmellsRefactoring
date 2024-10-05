package com.example.duplicatecode.code_smell;

import java.util.List;

public class GeneradorReporteVentas {
    public String generarReporteHTML(List<Venta> ventas) {
        StringBuilder reporte = new StringBuilder();
        reporte.append("<html><body><h1>Reporte de Ventas</h1><table>");
        for (Venta venta : ventas) {
            reporte.append("<tr><td>")
                   .append(venta.getId())
                   .append("</td><td>")
                   .append(venta.getMonto())
                   .append("</td></tr>");
        }
        reporte.append("</table></body></html>");
        return reporte.toString();
    }
}
