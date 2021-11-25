package br.com.mauraumdev.betslipworldcup.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTournament;
    private String name;
    private Integer numberOfTeams;

    public Tournament(){};

    public Tournament(Long idTournament, String name, Integer numberOfTeams){
        this.idTournament = idTournament;
        this.name = name;
        this.numberOfTeams = numberOfTeams;
    }

}
