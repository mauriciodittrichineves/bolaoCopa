package br.com.mauraumdev.bolaoCopa.repository;

import br.com.mauraumdev.bolaoCopa.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

    Game findById(long id);

}
