package br.com.mauraumdev.bolaoCopa.repository;

import br.com.mauraumdev.bolaoCopa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);

    User findByEmail(String email);

}
