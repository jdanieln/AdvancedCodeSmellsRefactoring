package com.example.primitiveobsession.refactoring;

public record CodigoCliente(String valor) {
    public CodigoCliente {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("El código de cliente no puede ser nulo o vacío");
        }
    }
}
