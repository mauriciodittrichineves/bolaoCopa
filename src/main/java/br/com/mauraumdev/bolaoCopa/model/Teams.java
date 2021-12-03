package br.com.mauraumdev.bolaoCopa.model;

import javax.persistence.*;


@Entity
@Table(name = "TB_TEAMS")
public class Teams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTeam;
    private String teamName;

    public Teams(Long idTeam, String teamName) {
        this.idTeam = idTeam;
        this.teamName = teamName;
    }

    public Teams() {

    }

    public Long getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(Long idTeam) {
        this.idTeam = idTeam;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}

