package com.example.duplicatecode.refactoring;

import java.util.List;
import java.util.function.Function;

public class GeneradorReporte {
    public <T> String generarReporteHTML(String titulo, List<T> elementos, Function<T, String> mapeadorFila) {
        StringBuilder reporte = new StringBuilder();
        reporte.append("<html><body><h1>").append(titulo).append("</h1><table>");
        elementos.forEach(elemento -> reporte.append(mapeadorFila.apply(elemento)));
        reporte.append("</table></body></html>");
        return reporte.toString();
    }
}
