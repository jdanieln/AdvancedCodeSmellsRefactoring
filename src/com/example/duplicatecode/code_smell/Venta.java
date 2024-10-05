package com.example.duplicatecode.code_smell;

public class Venta {
    private String id;
    private double monto;

    public Venta(String id, double monto) {
        this.id = id;
        this.monto = monto;
    }

    public String getId() {
        return id;
    }

    public double getMonto() {
        return monto;
    }
}
