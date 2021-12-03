package br.com.mauraumdev.bolaoCopa.resources;


import br.com.mauraumdev.bolaoCopa.model.Tournament;
import br.com.mauraumdev.bolaoCopa.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/betapi")

public class TournamentResources {

    @Autowired
    TournamentRepository tournamentRepository;

    @PostMapping("/tournament")
    public Tournament saveTournament(@RequestBody Tournament tournament){ return tournamentRepository.save(tournament);}

    @GetMapping("/tournament")
    public List<Tournament> allTournament(){return tournamentRepository.findAll();}

    @GetMapping("tournament/{id}")
    public Tournament findTournamentById(@PathVariable(value = "id")long idTournament){ return  tournamentRepository.findById(idTournament);}

    @DeleteMapping("/Tournament")
    public void deleteTournament(Tournament tournament){ tournamentRepository.delete(tournament);}

    @GetMapping("tournament/name={name}")
    public Tournament findTournamentByName(@PathVariable(value = "name")String name){return tournamentRepository.findByName(name);}
}
