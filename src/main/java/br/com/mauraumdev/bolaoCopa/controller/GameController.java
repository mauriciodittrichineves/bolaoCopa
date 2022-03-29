package br.com.mauraumdev.bolaoCopa.controller;

import br.com.mauraumdev.bolaoCopa.dto.GameDto;
import br.com.mauraumdev.bolaoCopa.model.Game;
import br.com.mauraumdev.bolaoCopa.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/betapi/game")
public class GameController {

    @Autowired
    GameService gameService;

    @PostMapping
    public void saveGame(@RequestBody Game game){gameService.saveGame(game);}

    @GetMapping
    public List<String> loadAllGames(){
        List<String> gamesInTournament = new ArrayList<>();
        int runner = 0;
        while(gameService.findAllGames().size() > runner ){
            gamesInTournament.add(GameDto.converteGame(gameService.findAllGames().get(runner)));
            runner++;
        }
        return gamesInTournament;
    }

    @GetMapping("/{id}")
    public Game findGameById(@PathVariable(value = "id")long idGame){return gameService.findGameById(idGame);}

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable(value = "id") long id){gameService.deleteById(id);}

    @GetMapping("/tournament/{id}")
    public String tournamentNameGame(@PathVariable(value = "id") long id){ return gameService.loadTournamentGameString(id);}
}
