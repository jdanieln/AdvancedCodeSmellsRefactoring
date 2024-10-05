package com.example.speculativegenerality.code_smell;

public class Main {
    public static void main(String[] args) {
        ProcesadorNotificaciones procesadorEmail = new ProcesadorEmail();
        procesadorEmail.enviarNotificacion();

        ProcesadorNotificaciones procesadorSMS = new ProcesadorSMS();
        procesadorSMS.enviarNotificacion();
    }
}
