package br.com.dio.desafio.designpatterns.shared.utils;

import java.util.UUID;

public class UUIDGenerator {
    public static String generateUUID() {
        return UUID.randomUUID().toString();
    }
}
