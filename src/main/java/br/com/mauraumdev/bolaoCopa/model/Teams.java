package br.com.mauraumdev.bolaoCopa.model;

import javax.persistence.*;
import java.util.List;


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
  public Teams(){}

  @ManyToMany
  @JoinTable(name = "tournament_games",joinColumns = {@JoinColumn(name = "id_team")},
          inverseJoinColumns = {@JoinColumn(name = "id_tournament")})
  List<Tournament> tournamentList;

  public List<Tournament> getTournamentList() {
    return tournamentList;
  }

  public void setTournamentList(List<Tournament> tournamentList) {
    this.tournamentList = tournamentList;
  }

  public Long getIdTeam() {
    return idTeam;
  }

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }
}