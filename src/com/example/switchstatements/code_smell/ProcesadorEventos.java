package com.example.switchstatements.code_smell;

public class ProcesadorEventos {
    public void procesarEvento(Evento evento) {
        switch (evento.getTipo()) {
            case "LOGIN":
                // Lógica para login
                break;
            case "LOGOUT":
                // Lógica para logout
                break;
            case "REGISTRO":
                // Lógica para registro
                break;
            default:
                throw new IllegalArgumentException("Tipo de evento desconocido");
        }
    }
}
