package br.com.mauraumdev.bolaoCopa.dto;

import br.com.mauraumdev.bolaoCopa.model.Tournament;

import java.util.List;
import java.util.stream.Collectors;

public class TournamenDto {
    private String name;
    private Integer numberOfTeams;

    public TournamenDto(Tournament tournament) {
        this.name = tournament.getName();
        this.numberOfTeams = tournament.getNumberOfTeams();
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

    public static List<TournamenDto> converter(List<Tournament> tournament){
        return tournament.stream().map(TournamenDto::new).collect(Collectors.toList());
    }
}
