package com.example.speculativegenerality.refactoring;

public class ProcesadorSMS implements ProcesadorNotificaciones {
    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando notificación por SMS.");
    }
}
