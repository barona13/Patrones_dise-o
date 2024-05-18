package com.singleton;
import java.util.Arrays;
import java.util.List;

public class Personas {
    private static Personas instance = null;
    private List<String> listaPersonas;

    private Personas() {
        listaPersonas = Arrays.asList("Juan", "María", "Carlos");
    }

    public static Personas getInstance() {
        if (instance == null) {
            instance = new Personas();
        }
        return instance;
    }

    public void mostrarPersonas() {
        System.out.println("lista de Personas:");
        for (String persona : listaPersonas) {
            System.out.println(persona);
        }
    }
}
