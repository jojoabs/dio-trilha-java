package br.com.dio.desafio.designpatterns.repository;

import br.com.dio.desafio.designpatterns.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
