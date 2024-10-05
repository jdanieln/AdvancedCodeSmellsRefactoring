package com.example.longmethod.refactoring;

import java.util.List;
import java.util.Map;

public class ProcesadorTransaccionesRefactorizado {

    public void procesarTransacciones(List<Transaccion> transacciones, Map<String, Double> tasasCambio) {
        for (Transaccion transaccion : transacciones) {
            validarTransaccion(transaccion);
            double montoConvertido = convertirMoneda(transaccion, tasasCambio);
            Cuenta cuentaOrigenActualizada = actualizarSaldos(transaccion, montoConvertido);
            registrarTransaccion(transaccion);
            notificarCliente(transaccion);
            manejarTransaccionGrande(transaccion, montoConvertido);
            Cuenta cuentaOrigenConComision = aplicarComision(transaccion, cuentaOrigenActualizada);
            actualizarAuditoria(transaccion, cuentaOrigenConComision);
        }
    }

    private void validarTransaccion(Transaccion transaccion) {
        if (transaccion.monto() <= 0) {
            throw new IllegalArgumentException("Monto inválido");
        }
        if (transaccion.cuentaDestino() == null || transaccion.cuentaOrigen() == null) {
            throw new IllegalArgumentException("Cuentas inválidas");
        }
    }

    private double convertirMoneda(Transaccion transaccion, Map<String, Double> tasasCambio) {
        String claveTasa = "%s-%s".formatted(transaccion.monedaOrigen(), transaccion.monedaDestino());
        double tasaCambio = tasasCambio.getOrDefault(claveTasa, 1.0);
        return transaccion.monto() * tasaCambio;
    }

    private Cuenta actualizarSaldos(Transaccion transaccion, double montoConvertido) {
        Cuenta cuentaOrigenActualizada = transaccion.cuentaOrigen().debitar(transaccion.monto());
        Cuenta cuentaDestinoActualizada = transaccion.cuentaDestino().acreditar(montoConvertido);
        // Actualizar las referencias si es necesario
        return cuentaOrigenActualizada;
    }

    private void registrarTransaccion(Transaccion transaccion) {
        HistorialTransacciones.registrar(transaccion);
    }

    private void notificarCliente(Transaccion transaccion) {
        Notificador.enviarNotificacion(transaccion);
    }

    private void manejarTransaccionGrande(Transaccion transaccion, double montoConvertido) {
        if (montoConvertido > 10000) {
            ReporteTransacciones.generarReporte(transaccion);
        }
    }

    private Cuenta aplicarComision(Transaccion transaccion, Cuenta cuentaOrigen) {
        double comision = calcularComision(transaccion);
        return cuentaOrigen.debitar(comision);
    }

    private double calcularComision(Transaccion transaccion) {
        // Lógica compleja para calcular la comisión
        return transaccion.monto() * 0.02;
    }

    private void actualizarAuditoria(Transaccion transaccion, Cuenta cuentaOrigenActualizada) {
        // Actualizar registros de auditoría
        Auditoria.actualizarRegistro(transaccion, calcularComision(transaccion));
    }
}
