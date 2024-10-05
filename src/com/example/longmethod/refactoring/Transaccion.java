package com.example.longmethod.refactoring;

public record Transaccion(
    double monto,
    Cuenta cuentaOrigen,
    Cuenta cuentaDestino,
    String monedaOrigen,
    String monedaDestino
) {}
