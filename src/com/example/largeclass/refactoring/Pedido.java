package com.example.largeclass.refactoring;

public record Pedido(String id, Usuario usuario, Producto producto, int cantidad) {}
