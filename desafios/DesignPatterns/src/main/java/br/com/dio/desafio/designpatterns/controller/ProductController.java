package br.com.dio.desafio.designpatterns.controller;

import br.com.dio.desafio.designpatterns.domain.entity.Product;
import br.com.dio.desafio.designpatterns.facade.ProductFacade;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@Tag(name = "Products", description = "Gerenciamento de produtos")
public class ProductController {

    @Autowired
    private ProductFacade productFacade;

    @Operation(summary = "Listar todos os produtos")
    @GetMapping
    public List<Product> getAllProducts() {
        return productFacade.findAllProducts();
    }

    @Operation(summary = "Criar um novo produto")
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product createdProduct = productFacade.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
    }

    @Operation(summary = "Atualizar um produto existente")
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        Product updatedProduct = productFacade.updateProduct(id, productDetails);
        return ResponseEntity.ok(updatedProduct);
    }

    @Operation(summary = "Deletar um produto")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productFacade.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}
