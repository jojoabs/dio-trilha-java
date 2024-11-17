package br.com.dio.desafio.springrestap.dto;

public class ProductResponseDTO {
    private String name;
    private Double price;

    public ProductResponseDTO(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // Getters e Setters
}
