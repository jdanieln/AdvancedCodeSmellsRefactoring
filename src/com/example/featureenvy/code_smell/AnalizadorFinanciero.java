package com.example.featureenvy.code_smell;

public class AnalizadorFinanciero {
    public double calcularRiesgo(Cliente cliente) {
        double ingresos = cliente.getIngresosAnuales();
        double deudas = cliente.getDeudasTotales();
        double activos = cliente.getValorActivos();
        double puntuacionCredito = cliente.getPuntuacionCredito();

        // Compleja fórmula de cálculo de riesgo
        return (deudas / ingresos) * (1 / puntuacionCredito) * (activos / 100000);
    }
}
