package br.com.dio.desafio.designpatterns.service;

import br.com.dio.desafio.designpatterns.domain.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product save(Product product);
    Product update(Long id, Product productDetails);
    void delete(Long id);
}
