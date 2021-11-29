package br.com.mauraumdev.betslipworldcup.entities;

import javax.persistence.*;

@Entity
@Table(name ="TB_TEAMS")
public class Teams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idTeam;
    private String teamName;

    public Teams(String idTeam, String teamName) {
        this.idTeam = idTeam;
        this.teamName = teamName;
    }

    public Teams() {

    }

    public String getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(String idTeam) {
        this.idTeam = idTeam;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
