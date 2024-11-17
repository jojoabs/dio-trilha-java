package br.com.dio.desafio.springrestap.service;

import br.com.dio.desafio.springrestap.entity.Product;
import br.com.dio.desafio.springrestap.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Page<Product> findAll(Pageable pageable) {
        logger.info("Fetching all products with pagination.");
        return productRepository.findAll(pageable);
    }

    public List<Product> findAll() {
        logger.info("Fetching all products.");
        return productRepository.findAll();
    }

    public List<Product> searchByName(String name) {
        logger.info("Searching products by name: {}", name);
        return productRepository.findByNameContainingIgnoreCase(name);
    }

    public Product findById(Long id) {
        logger.info("Fetching product by ID: {}", id);
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public Product save(Product product) {
        logger.info("Saving product: {}", product.getName());
        return productRepository.save(product);
    }

    public void delete(Long id) {
        logger.info("Deleting product by ID: {}", id);
        productRepository.deleteById(id);
    }
}
