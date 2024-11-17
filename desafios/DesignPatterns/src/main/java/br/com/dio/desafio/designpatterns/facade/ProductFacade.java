package br.com.dio.desafio.designpatterns.facade;

import br.com.dio.desafio.designpatterns.domain.entity.Product;

import java.util.List;

public interface ProductFacade {
    List<Product> findAllProducts();
    Product createProduct(Product product);
    Product updateProduct(Long id, Product productDetails);
    void deleteProduct(Long id);
}
