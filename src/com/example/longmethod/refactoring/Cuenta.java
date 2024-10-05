package com.example.longmethod.refactoring;

public record Cuenta(String numeroCuenta, double saldo) {

    public Cuenta {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }
    }

    public Cuenta debitar(double monto) {
        if (saldo >= monto) {
            return new Cuenta(numeroCuenta, saldo - monto);
        } else {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }

    public Cuenta acreditar(double monto) {
        return new Cuenta(numeroCuenta, saldo + monto);
    }
}
