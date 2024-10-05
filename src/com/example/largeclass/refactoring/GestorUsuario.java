package com.example.largeclass.refactoring;

import java.util.HashMap;
import java.util.Map;

public class GestorUsuario {
    private Map<String, Usuario> usuarios = new HashMap<>();

    public void registrarUsuario(Usuario usuario) {
        usuarios.put(usuario.id(), usuario);
        System.out.println("Usuario registrado: " + usuario.nombre());
    }

    public void eliminarUsuario(String idUsuario) {
        usuarios.remove(idUsuario);
        System.out.println("Usuario eliminado: " + idUsuario);
    }

    public Usuario obtenerUsuario(String idUsuario) {
        return usuarios.get(idUsuario);
    }
}