package com.mediator;

public class ConcreteMediator implements Mediator {

    private Radio radio;
    private Telefono telefono;

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    @Override
    public void enciende() {
        if (radio != null) {
            radio.enciende();
        }
        if (telefono != null) {
            telefono.apagaMusica();
        }
    }

    @Override
    public void apaga() {
        if (radio != null) {
            radio.apaga();
        }
    }

    @Override
    public void recibeLlamada() {
        if (radio != null) {
            radio.apaga();
        }
    }

    @Override
    public void enciendeMusica() {
        if (telefono != null) {
            telefono.enciendeMusica();
        }
    }

    @Override
    public void apagaMusica() {
        if (telefono != null) {
            telefono.apagaMusica();
        }
    }

    @Override
    public boolean musicaEncendida() {
        return telefono != null && telefono.musicaEncendida();
    }

    @Override
    public boolean encendida() {
        return radio != null && radio.encendida();
    }
}
