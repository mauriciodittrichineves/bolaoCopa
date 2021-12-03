package br.com.mauraumdev.bolaoCopa.repository;

import br.com.mauraumdev.bolaoCopa.model.Teams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeamsRepository extends JpaRepository<Teams, Long> {

    Teams findById(long id);


    Teams findByTeamName(String team);
}
