package br.com.mauraumdev.bolaoCopa.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "TB_GAME")
public class Game implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public long id;
    @OneToOne
    @JoinColumn(name = "team_1_id_team")
    public Teams team1;
    @OneToOne
    @JoinColumn(name = "teams_2_id_team")
    public Teams team2;
    public int team1Points;
    public int team2Points;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tournament")
    public Tournament tournament;

    public Game() { }
    public Game(long id, Teams team1, Teams team2, int team1Points, int team2Points) {
        this.id = id;
        this.team1 = team1;
        this.team2 = team2;
        this.team1Points = team1Points;
        this.team2Points = team2Points;

    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Teams getTeam1() {
        return team1;
    }

    public void setTeam1(Teams team1) {
        this.team1 = team1;
    }

    public Teams getTeam2() {
        return team2;
    }

    public void setTeam2(Teams team2) {
        this.team2 = team2;
    }

    public int getTeam1Points() {
        return team1Points;
    }

    public void setTeam1Points(int team1Points) {
        this.team1Points = team1Points;
    }

    public int getTeam2Points() {
        return team2Points;
    }

    public void setTeam2Points(int team2Points) {
        this.team2Points = team2Points;
    }

}
