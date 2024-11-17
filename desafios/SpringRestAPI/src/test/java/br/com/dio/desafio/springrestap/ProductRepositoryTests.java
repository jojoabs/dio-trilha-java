package br.com.dio.desafio.springrestap;

import br.com.dio.desafio.springrestap.entity.Product;
import br.com.dio.desafio.springrestap.repository.ProductRepository;
import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProductRepositoryTests {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testFindByName() {
        Product product = new Product();
        product.setName("Notebook");
        product.setPrice(3000.0);
        productRepository.save(product);

        List<Product> results = productRepository.findByNameContainingIgnoreCase("note");
        assertEquals(1, results.size());
        assertEquals("Notebook", results.get(0).getName());
    }
}
