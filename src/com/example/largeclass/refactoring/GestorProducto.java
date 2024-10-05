package com.example.largeclass.refactoring;

import java.util.HashMap;
import java.util.Map;

public class GestorProducto {
    private Map<String, Producto> productos = new HashMap<>();

    public void agregarProducto(Producto producto) {
        productos.put(producto.id(), producto);
        System.out.println("Producto agregado: " + producto.nombre());
    }

    public void actualizarInventario(String idProducto, int cantidad) {
        Producto producto = productos.get(idProducto);
        if (producto != null) {
            Producto productoActualizado = new Producto(producto.id(), producto.nombre(), cantidad);
            productos.put(idProducto, productoActualizado);
            System.out.println("Inventario actualizado para: " + producto.nombre());
        }
    }

    public Producto obtenerProducto(String idProducto) {
        return productos.get(idProducto);
    }
}