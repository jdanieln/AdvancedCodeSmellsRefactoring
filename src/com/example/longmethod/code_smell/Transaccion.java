package com.example.longmethod.code_smell;

public class Transaccion {
    private double monto;
    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;
    private String monedaOrigen;
    private String monedaDestino;

    public Transaccion(double monto, Cuenta cuentaOrigen, Cuenta cuentaDestino, String monedaOrigen, String monedaDestino) {
        this.monto = monto;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
    }

    public double getMonto() {
        return monto;
    }

    public Cuenta getCuentaOrigen() {
        return cuentaOrigen;
    }

    public Cuenta getCuentaDestino() {
        return cuentaDestino;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }
}
