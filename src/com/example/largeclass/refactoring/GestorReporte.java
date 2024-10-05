package com.example.largeclass.refactoring;
import java.util.List;

public class GestorReporte {
    private final GeneradorReporte generadorReporte = new GeneradorReporte();

    public void generarReporteUsuarios(List<Usuario> usuarios) {
        generadorReporte.generarReporte("Reporte de Usuarios", usuarios,
            usuario -> "ID: " + usuario.id() + ", Nombre: " + usuario.nombre());
    }

    public void generarReporteProductos(List<Producto> productos) {
        generadorReporte.generarReporte("Reporte de Productos", productos,
            producto -> "ID: " + producto.id() + ", Nombre: " + producto.nombre() + ", Cantidad: " + producto.cantidad());
    }

    public void generarReportePedidos(List<Pedido> pedidos) {
        generadorReporte.generarReporte("Reporte de Pedidos", pedidos,
            pedido -> "ID: " + pedido.id() + ", Usuario: " + pedido.usuario().nombre() + ", Producto: " + pedido.producto().nombre() + ", Cantidad: " + pedido.cantidad());
    }
}