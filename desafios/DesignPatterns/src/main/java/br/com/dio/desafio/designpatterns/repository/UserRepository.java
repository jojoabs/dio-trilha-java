package br.com.dio.desafio.designpatterns.repository;

import br.com.dio.desafio.designpatterns.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
