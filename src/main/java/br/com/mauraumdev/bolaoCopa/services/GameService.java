package br.com.mauraumdev.bolaoCopa.services;

import br.com.mauraumdev.bolaoCopa.dto.GameDto;
import br.com.mauraumdev.bolaoCopa.model.Game;
import br.com.mauraumdev.bolaoCopa.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    public void saveGame(Game game){gameRepository.save(game);}
    public Game findGameById(long id){return gameRepository.findById(id);}
    public void deleteById(long id){gameRepository.deleteById(id);}
    public String loadTournamentGameString(long id){
        Game game = gameRepository.findById(id);
        return "O jogo de hoje será pelo torneio  " + game.tournament.getName();
    }
    public List<String> loadAllGames(){
        List<String> gamesInTournament = new ArrayList<>();
        int runner = 0;
        while(gameRepository.findAll().size() > runner ){
            gamesInTournament.add(GameDto.converteGame(gameRepository.findAll().get(runner)));
            runner++;
        }
        return gamesInTournament;
    }
}
