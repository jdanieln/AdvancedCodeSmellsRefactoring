package com.example.longmethod.code_smell;

import java.util.ArrayList;
import java.util.List;

public class HistorialTransacciones {
    private static List<Transaccion> historial = new ArrayList<>();

    public static void registrar(Transaccion transaccion) {
        historial.add(transaccion);
        System.out.println("Transacción registrada en el historial.");
    }

    public static List<Transaccion> obtenerHistorial() {
        return historial;
    }
}
