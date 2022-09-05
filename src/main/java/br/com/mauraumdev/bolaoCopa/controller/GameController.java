package br.com.mauraumdev.bolaoCopa.controller;

import br.com.mauraumdev.bolaoCopa.dto.GameDto;
import br.com.mauraumdev.bolaoCopa.model.Game;
import br.com.mauraumdev.bolaoCopa.model.Result;
import br.com.mauraumdev.bolaoCopa.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
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
    public List<String> loadAllGames(){return gameService.loadAllGames();}

    @GetMapping("/{id}")
    public Game findGameById(@PathVariable(value = "id")long idGame){return gameService.findGameById(idGame);}

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable(value = "id") long id){gameService.deleteById(id);}

    @GetMapping("/tournament/{id}")
    public String tournamentNameGame(@PathVariable(value = "id") long id){ return gameService.loadTournamentGameString(id);}


    @PatchMapping
    public  void insertResult(@RequestBody Result result){
        System.out.println("1");
        System.out.println("O Id foi o " + result.getId() + ", O time 1:" + result.getResult1());

        gameService.insertResultGame(result.getId(), result.getResult1(), result.getResult2());
        System.out.println("2");
    }
}
