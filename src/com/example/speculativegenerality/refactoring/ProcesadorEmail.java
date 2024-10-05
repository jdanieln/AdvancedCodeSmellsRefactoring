package com.example.speculativegenerality.refactoring;

public class ProcesadorEmail implements ProcesadorNotificaciones {
    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando notificación por Email.");
    }
}
