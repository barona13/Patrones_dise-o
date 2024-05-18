import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.mediator.Coche;
import com.mediator.Radio;
import com.mediator.Telefono;
import com.mediator.ConcreteMediator;
import com.mediator.Mediator;

public class TestCoches {

    private Radio radio;
    private Telefono telefono;
    private Coche coche;
    private Mediator mediator;

    @Before
    public void init() {
        mediator = new ConcreteMediator();
        radio = new Radio();
        telefono = new Telefono();
        coche = new Coche();
        
        ((ConcreteMediator) mediator).setRadio(radio);
        ((ConcreteMediator) mediator).setTelefono(telefono);

        telefono.setMediator(mediator);
        coche.setMediator(mediator);
    }

    @Test
    public void test_encender_apagar_coche() {
        assertFalse(radio.encendida());
        assertFalse(telefono.musicaEncendida());

        telefono.enciendeMusica();
        assertTrue(telefono.musicaEncendida());

        coche.enciende();

        assertTrue(radio.encendida());
        assertFalse(telefono.musicaEncendida());

        coche.apaga();
        assertFalse(radio.encendida());
    }

    @Test
    public void test_suena_telefono() {
        radio.enciende();
        assertTrue(radio.encendida());

        telefono.recibeLlamada();

        assertFalse(radio.encendida());
    }

    @Test
    public void test_enciende_radio() {
        telefono.enciendeMusica();
        assertTrue(telefono.musicaEncendida());

        mediator.enciende();

        assertTrue(radio.encendida());
        assertFalse(telefono.musicaEncendida());
    }
}
