package br.com.dio.desafio.designpatterns.controller;

import br.com.dio.desafio.designpatterns.domain.entity.Product;
import br.com.dio.desafio.designpatterns.facade.ProductFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductFacade productFacade;

    @GetMapping
    public List<Product> getAllProducts() {
        return productFacade.findAllProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productFacade.createProduct(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        try {
            Product updatedProduct = productFacade.updateProduct(id, productDetails);
            return ResponseEntity.ok(updatedProduct);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteProduct(@PathVariable Long id) {
        try {
            productFacade.deleteProduct(id);
            return ResponseEntity.ok().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
