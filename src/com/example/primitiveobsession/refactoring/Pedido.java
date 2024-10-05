package com.example.primitiveobsession.refactoring;

public record Pedido(
    String numeroPedido,
    CodigoProducto codigoProducto,
    CodigoCliente codigoCliente,
    int cantidad
) {}
