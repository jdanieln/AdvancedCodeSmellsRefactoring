package com.example.largeclass.refactoring;

import java.util.List;
import java.util.function.Function;

public class GeneradorReporte {
    public <T> void generarReporte(String titulo, List<T> elementos, Function<T, String> mapeador) {
        System.out.println("=== " + titulo + " ===");
        elementos.forEach(elemento -> System.out.println(mapeador.apply(elemento)));
        System.out.println("=====================");
    }
}