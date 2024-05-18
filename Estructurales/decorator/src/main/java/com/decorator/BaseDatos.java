package com.decorator;

import java.util.List;

public interface BaseDatos {

    void inserta (String registro);

    List<String> registros();
}
