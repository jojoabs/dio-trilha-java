package br.com.dio.desafio.designpatterns.service.impl;

import br.com.dio.desafio.designpatterns.domain.entity.Product;
import br.com.dio.desafio.designpatterns.repository.ProductRepository;
import br.com.dio.desafio.designpatterns.service.ProductService;
import br.com.dio.desafio.designpatterns.shared.exceptions.ResourceNotFoundException;
import br.com.dio.desafio.designpatterns.singleton.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    private final LogManager logManager = LogManager.getInstance();

    @Override
    public List<Product> findAll() {
        logManager.log("Listando todos os produtos.");
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        logManager.log("Criando produto: " + product.getName());
        return productRepository.save(product);
    }

    @Override
    public Product update(Long id, Product productDetails) {
        return productRepository.findById(id).map(product -> {
            product.setName(productDetails.getName());
            product.setPrice(productDetails.getPrice());
            logManager.log("Atualizando produto ID: " + id);
            return productRepository.save(product);
        }).orElseThrow(() -> new ResourceNotFoundException("Produto com ID " + id + " não encontrado!"));
    }

    @Override
    public void delete(Long id) {
        productRepository.findById(id).ifPresentOrElse(product -> {
            productRepository.delete(product);
            logManager.log("Deletando produto ID: " + id);
        }, () -> {
            throw new ResourceNotFoundException("Produto com ID " + id + " não encontrado!");
        });
    }
}
