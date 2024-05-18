import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.decorator.Logger;
import com.decorator.LoggerDecorator;
import com.decorator.BaseDatos;
import com.decorator.BaseDatosMemoria;

public class TestLogger {

    private Logger logger = new Logger();
    private BaseDatos sinLogger = new BaseDatosMemoria();
    
    private BaseDatos baseDatos;
    
    @Before
    public void init() {
        baseDatos = new LoggerDecorator(sinLogger, logger);
    }
    
    @Test
    public void test_logger_decorator() {
        assertNotNull("falta inicializar baseDatos en el metodo init()", baseDatos);
        assertFalse("logger no esta vacio", logger.obtener().contains("inserta entrada"));
        baseDatos.inserta("entrada");
        
        assertTrue("baseDatos no ha recibido entrada", sinLogger.registros().contains("entrada"));
        assertTrue("no se ha registrado la entrada", logger.obtener().contains("inserta entrada"));

        List<String> registros = baseDatos.registros();
        
        assertTrue("el adapter no tiene la nueva entrada", registros.contains("entrada"));
        assertTrue("no se ha registrado la lectura", logger.obtener().contains("lectura de registros"));
    }
}