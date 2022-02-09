package br.com.mauraumdev.bolaoCopa.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name="TB_TOURNAMENTS")
public class Tournament implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTournament;
    private String name;
    private Integer numberOfTeams;



    @OneToMany(fetch = FetchType.LAZY)
    private List<Game> gameTable;


    public Tournament(){};

    public Tournament(Long idTournament, String name, Integer numberOfTeams){
        this.idTournament = idTournament;
        this.name = name;
        this.numberOfTeams = numberOfTeams;

    }
    public List<Game> getGameTable() {
        return gameTable;
    }

    public void setGameTable(List<Game> gameTable) {
        this.gameTable = gameTable;
    }

    public Long getIdTournament() {
        return idTournament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfTeams() {
        return numberOfTeams;
    }

    public void setNumberOfTeams(Integer numberOfTeams) {
        this.numberOfTeams = numberOfTeams;
    }


}