package br.com.dio.desafio.designpatterns.shared.utils;

public class ValidationUtils {

    public static void validatePrice(Double price) {
        if (price == null || price <= 0) {
            throw new IllegalArgumentException("O preço do produto deve ser maior que zero.");
        }
    }

    public static void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto é obrigatório.");
        }
    }
}
