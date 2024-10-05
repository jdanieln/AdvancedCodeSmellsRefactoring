package com.example.largeclass.refactoring;

import java.util.HashMap;
import java.util.Map;

public class GestorPedido {
    private Map<String, Pedido> pedidos = new HashMap<>();

    public void crearPedido(Pedido pedido) {
        pedidos.put(pedido.id(), pedido);
        System.out.println("Pedido creado: " + pedido.id());
    }

    public void cancelarPedido(String idPedido) {
        pedidos.remove(idPedido);
        System.out.println("Pedido cancelado: " + idPedido);
    }

    public Pedido obtenerPedido(String idPedido) {
        return pedidos.get(idPedido);
    }
}