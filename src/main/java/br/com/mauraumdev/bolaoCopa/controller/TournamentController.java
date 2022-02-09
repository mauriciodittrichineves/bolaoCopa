package br.com.mauraumdev.bolaoCopa.controller;


import br.com.mauraumdev.bolaoCopa.dto.TournamenDto;
import br.com.mauraumdev.bolaoCopa.model.Game;
import br.com.mauraumdev.bolaoCopa.model.Tournament;
import br.com.mauraumdev.bolaoCopa.services.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/betapi/tournament")

public class TournamentController {

    @Autowired
    TournamentService tournamentService;

    @PostMapping
    public void saveTournament(@RequestBody Tournament tournament){tournamentService.saveTournament(tournament);}

    @GetMapping
    public List<TournamenDto> allTournament(){return tournamentService.listAllTournament();}

    @GetMapping("/{id}")
    public Tournament findTournamentById(@PathVariable(value = "id")long idTournament){ return  tournamentService.findTournamentById(idTournament);}

    @DeleteMapping("/{id}")
    public String deleteTournamentById(@PathVariable(value = "id") Long id){return tournamentService.deleteTournamentById(id);}

    @GetMapping("/name={name}")
    public Tournament findTournamentByName(@PathVariable(value = "name")String name){return tournamentService.findTournamentByName(name);}

    @GetMapping("/allgames/{id}")
    public List<Game> loadAllTournamentGames(@PathVariable(value = "id")long idTournament){
        Tournament tournament = tournamentService.findTournamentById(idTournament);
        return tournament.getGameTable();
    }
}
