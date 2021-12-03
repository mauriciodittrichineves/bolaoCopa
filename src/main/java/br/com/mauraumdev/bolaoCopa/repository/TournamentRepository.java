package br.com.mauraumdev.bolaoCopa.repository;

import br.com.mauraumdev.bolaoCopa.model.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentRepository extends JpaRepository<Tournament, Long> {

    Tournament findById(long id);

    Tournament findByName(String name);
}
