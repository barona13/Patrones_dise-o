package com.mediator;

public class Telefono {
    private boolean musicaEncendida = false;
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enciendeMusica() {
        musicaEncendida = true;
        System.out.println("Música encendida.");
    }

    public void apagaMusica() {
        musicaEncendida = false;
        System.out.println("Música apagada.");
    }

    public boolean musicaEncendida() {
        return musicaEncendida;
    }

    public void recibeLlamada() {
        if (mediator != null) {
            mediator.recibeLlamada();
        }
    }
}
