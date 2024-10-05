package com.example.featureenvy.refactoring;

public record Cliente(
    double ingresosAnuales,
    double deudasTotales,
    double valorActivos,
    double puntuacionCredito
) {

    public double calcularRiesgoFinanciero() {
        return (deudasTotales / ingresosAnuales) * (1 / puntuacionCredito) * (valorActivos / 100000);
    }
}
