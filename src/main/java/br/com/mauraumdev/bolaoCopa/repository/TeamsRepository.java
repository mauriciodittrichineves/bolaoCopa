package br.com.mauraumdev.bolaoCopa.repository;

import br.com.mauraumdev.bolaoCopa.model.Teams;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeamsRepository extends JpaRepository<Teams, Long> {


    Teams findById(long id);
    Teams findByTeamName(String team);

}
