package com.example.speculativegenerality.code_smell;

public abstract class ProcesadorNotificaciones {
    public abstract void enviarNotificacion();
}

// Implementaciones actuales
class ProcesadorEmail extends ProcesadorNotificaciones {
    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando notificación por Email.");
    }
}

class ProcesadorSMS extends ProcesadorNotificaciones {
    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando notificación por SMS.");
    }
}

// Clases no utilizadas (especulativas)
class ProcesadorPush extends ProcesadorNotificaciones {
    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando notificación Push.");
    }
}

class ProcesadorFax extends ProcesadorNotificaciones {
    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando notificación por Fax.");
    }
}
