package br.com.mauraumdev.bolaoCopa.model;

import javax.persistence.*;

@Entity
@Table(name="TB_TOURNAMENTS")
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