package com.singleton;

public class Main {
    public static void main(String[] args) {
        Personas personas = Personas.getInstance();
        personas.mostrarPersonas();
    }
}
