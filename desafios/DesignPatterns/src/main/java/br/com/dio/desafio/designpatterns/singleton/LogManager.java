package br.com.dio.desafio.designpatterns.singleton;

import java.time.LocalDateTime;

public class LogManager {

    private static LogManager instance;

    private LogManager() {}

    public static LogManager getInstance() {
        if (instance == null) {
            instance = new LogManager();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[" + LocalDateTime.now() + "] " + message);
    }
}
