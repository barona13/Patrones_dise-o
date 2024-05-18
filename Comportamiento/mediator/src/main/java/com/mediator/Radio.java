package com.mediator;

public class Radio {

    private boolean encendida = false;

    public void enciende() {
        encendida = true;
        System.out.println("Radio encendida.");
    }

    public void apaga() {
        encendida = false;
        System.out.println("Radio apagada.");
    }

    public boolean encendida() {
        return encendida;
    }
}
