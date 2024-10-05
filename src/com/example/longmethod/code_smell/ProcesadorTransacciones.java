package com.example.longmethod.code_smell;

import java.util.List;
import java.util.Map;

public class ProcesadorTransacciones {
    private static final Notificador Notificador = null;

	public void procesarTransacciones(List<Transaccion> transacciones, Map<String, Double> tasasCambio) {
        for (Transaccion transaccion : transacciones) {
            // Validar la transacción
            if (transaccion.getMonto() <= 0) {
                throw new IllegalArgumentException("Monto inválido");
            }
            if (transaccion.getCuentaDestino() == null || transaccion.getCuentaOrigen() == null) {
                throw new IllegalArgumentException("Cuentas inválidas");
            }

            // Calcular el monto en la moneda de destino
            String monedaOrigen = transaccion.getMonedaOrigen();
            String monedaDestino = transaccion.getMonedaDestino();
            double tasaCambio = tasasCambio.getOrDefault(monedaOrigen + "-" + monedaDestino, 1.0);
            double montoConvertido = transaccion.getMonto() * tasaCambio;

            // Actualizar saldos
            transaccion.getCuentaOrigen().debitar(transaccion.getMonto());
            transaccion.getCuentaDestino().acreditar(montoConvertido);

            // Registrar en el historial
            HistorialTransacciones.registrar(transaccion);

            // Enviar notificación
            Notificador.enviarNotificacion(transaccion);

            // Generar reporte si es una transacción grande
            if (montoConvertido > 10000) {
                ReporteTransacciones.generarReporte(transaccion);
            }

            // Aplicar comisiones
            double comision = calcularComision(transaccion);
            transaccion.getCuentaOrigen().debitar(comision);

            // Actualizar registros de auditoría
            Auditoria.actualizarRegistro(transaccion, comision);
        }
    }

    private double calcularComision(Transaccion transaccion) {
        // Lógica compleja para calcular la comisión
        return transaccion.getMonto() * 0.02;
    }
}
