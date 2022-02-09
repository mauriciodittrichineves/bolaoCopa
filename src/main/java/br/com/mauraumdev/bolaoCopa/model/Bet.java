package br.com.mauraumdev.bolaoCopa.model;

public class Bet {
    public long id;
    public Game game;
    public int guessTeam1;
    public int guessTeam2;

    public Bet(long id, Game game, int guessTeam1, int guessTeam2) {
        this.id = id;
        this.game = game;
        this.guessTeam1 = guessTeam1;
        this.guessTeam2 = guessTeam2;
    }

    public Bet() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getGuessTeam1() {
        return guessTeam1;
    }

    public void setGuessTeam1(int guessTeam1) {
        this.guessTeam1 = guessTeam1;
    }

    public int getGuessTeam2() {
        return guessTeam2;
    }

    public void setGuessTeam2(int guessTeam2) {
        this.guessTeam2 = guessTeam2;
    }
}
