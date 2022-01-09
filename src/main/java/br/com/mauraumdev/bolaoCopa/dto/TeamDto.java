package br.com.mauraumdev.bolaoCopa.dto;

import br.com.mauraumdev.bolaoCopa.model.Teams;

import java.util.List;
import java.util.stream.Collectors;

public class TeamDto {
    private long idTeam;
    private String teamName;

    public TeamDto(Teams team) {
        this.idTeam = team.getIdTeam();
        this.teamName = team.getTeamName();
    }


    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public static List<TeamDto> converter(List<Teams> teams){
        return teams.stream().map(TeamDto::new).collect(Collectors.toList());
    }
}
