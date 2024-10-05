package com.example.featureenvy.refactoring;

public class AnalizadorFinanciero {
    public double obtenerRiesgo(Cliente cliente) {
        return cliente.calcularRiesgoFinanciero();
    }
}
