package com.example.longmethod.code_smell;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;

    public Cuenta(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public void debitar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
        } else {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }

    public void acreditar(double monto) {
        saldo += monto;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
}
