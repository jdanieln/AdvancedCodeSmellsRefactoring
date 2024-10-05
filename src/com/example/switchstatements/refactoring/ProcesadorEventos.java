package com.example.switchstatements.refactoring;

public class ProcesadorEventos {
    public void procesarEvento(Evento evento) {
        switch (evento) {
            case LoginEvento login -> procesarLogin(login);
            case LogoutEvento logout -> procesarLogout(logout);
            case RegistroEvento registro -> procesarRegistro(registro);
        }
    }

    private void procesarLogin(LoginEvento evento) {
        // Lógica para login
    }

    private void procesarLogout(LogoutEvento evento) {
        // Lógica para logout
    }

    private void procesarRegistro(RegistroEvento evento) {
        // Lógica para registro
    }
}
