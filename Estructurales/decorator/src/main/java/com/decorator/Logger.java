package com.decorator;

import java.util.ArrayList;
import java.util.List;

public class Logger {

    private List<String> log = new ArrayList<>();

    public void add(String message) {
        log.add(message);
    }

    public List<String> getLog() {
        return new ArrayList<>(log);
    }

    public List<String> obtener() {
        return new ArrayList<>(log);
    }
    
}
