package com.decorator;

import java.util.List;

public class LoggerDecorator implements BaseDatos{

    private BaseDatos baseDatos;
    private Logger logger;

    public LoggerDecorator(BaseDatos baseDatos, Logger logger) {
        this.baseDatos = baseDatos;
        this.logger = logger;
    }

    @Override
    public void inserta(String registro) {
        logger.add("inserta " + registro);
        baseDatos.inserta(registro);
        
    }

    @Override
    public List<String> registros() {
        logger.add("lectura de registros");
        return baseDatos.registros();
    }

    
}
