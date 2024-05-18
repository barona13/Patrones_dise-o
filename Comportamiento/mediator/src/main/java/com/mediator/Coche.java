package com.mediator;

public class Coche {
    private Mediator mediator;
    
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enciende() {
        System.out.println("Coche encendido.");
        mediator.enciende();
        mediator.apagaMusica();
    }

    public void apaga() {
        System.out.println("Coche apagado.");
        mediator.apaga();
    }
}
