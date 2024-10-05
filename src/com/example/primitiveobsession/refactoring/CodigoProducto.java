package com.example.primitiveobsession.refactoring;

public record CodigoProducto(String valor) {
    public CodigoProducto {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("El código de producto no puede ser nulo o vacío");
        }
    }
}
