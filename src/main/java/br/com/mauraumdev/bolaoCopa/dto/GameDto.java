package br.com.mauraumdev.bolaoCopa.dto;

import br.com.mauraumdev.bolaoCopa.model.Game;
import br.com.mauraumdev.bolaoCopa.model.Teams;

public class GameDto {
    private Teams team1;
    private Teams team2;

    public GameDto(String gameIs, Teams team1, Teams team2) {
        this.team1 = team1;
        this.team2 = team2;
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

    public static String converteGame(Game game){
        return game.getTeam1().getTeamName() + " x " + game.getTeam2().getTeamName();

    }
}
