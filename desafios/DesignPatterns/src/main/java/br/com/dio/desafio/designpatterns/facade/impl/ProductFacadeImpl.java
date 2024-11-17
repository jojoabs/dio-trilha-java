package br.com.dio.desafio.designpatterns.facade.impl;

import br.com.dio.desafio.designpatterns.domain.entity.Product;
import br.com.dio.desafio.designpatterns.service.ProductService;
import br.com.dio.desafio.designpatterns.singleton.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductFacadeImpl implements br.com.dio.desafio.designpatterns.facade.ProductFacade {

    @Autowired
    private ProductService productService;

    private final LogManager logManager = LogManager.getInstance();

    @Override
    public List<Product> findAllProducts() {
        logManager.log("Facade: Listando todos os produtos.");
        return productService.findAll();
    }

    @Override
    public Product createProduct(Product product) {
        logManager.log("Facade: Validando e criando produto: " + product.getName());
        validateProduct(product);
        return productService.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product productDetails) {
        logManager.log("Facade: Validando e atualizando produto ID: " + id);
        validateProduct(productDetails);
        return productService.update(id, productDetails);
    }

    @Override
    public void deleteProduct(Long id) {
        logManager.log("Facade: Deletando produto ID: " + id);
        productService.delete(id);
    }

    private void validateProduct(Product product) {
        if (product.getPrice() <= 0) {
            throw new IllegalArgumentException("O preço do produto deve ser maior que zero.");
        }
        if (product.getName() == null || product.getName().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto é obrigatório.");
        }
    }
}
