package br.com.mauraumdev.bolaoCopa.controller;


import br.com.mauraumdev.bolaoCopa.dto.TournamenDto;
import br.com.mauraumdev.bolaoCopa.model.Tournament;
import br.com.mauraumdev.bolaoCopa.services.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/betapi")

public class TournamentController {

    @Autowired
    TournamentService tournamentService;

    @PostMapping("/tournament")
    public void saveTournament(@RequestBody Tournament tournament){tournamentService.saveTournament(tournament);}

    @GetMapping("/tournament")
    public List<TournamenDto> allTournament(){return tournamentService.listAllTournament();}

    @GetMapping("tournament/{id}")
    public Tournament findTournamentById(@PathVariable(value = "id")long idTournament){ return  tournamentService.findTournamentById(idTournament);}

    @DeleteMapping("/tournament/{id}")
    public String deleteTournamentById(@PathVariable(value = "id") Long id){return tournamentService.deleteTournamentById(id);}

    @GetMapping("tournament/name={name}")
    public Tournament findTournamentByName(@PathVariable(value = "name")String name){return tournamentService.findTournamentByName(name);}
}
