package br.com.mauraumdev.bolaoCopa.resources;

import br.com.mauraumdev.bolaoCopa.model.Teams;
import br.com.mauraumdev.bolaoCopa.repository.TeamsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/betapi")
public class TeamsResource {
    @Autowired
    TeamsRepository teamsRepository;

    @GetMapping("/teams")
    public List<Teams> listTeams(){
        return teamsRepository.findAll();
    }
    @PostMapping("/teams")
    public Teams saveTeam(@RequestBody Teams teams){
        return teamsRepository.save(teams);
    }
    @GetMapping("teams/{id}")
    public Teams selectTeam(@PathVariable(value ="id") long idTeam){
        return teamsRepository.findById(idTeam);
    }
    @GetMapping("team/{name}")
    public Teams selectTeams(@PathVariable(value="name")String team){
        return teamsRepository.findByTeamName(team);
    }
    //Verificar pq este metodo não esta deletando
    @DeleteMapping("/teams")
    public void deleteTeam(Teams team){
        teamsRepository.delete(team);
    }
    @DeleteMapping("/teams/{id}")
    public void deleteTeamById(@PathVariable(value = "id") long idTeam){
        teamsRepository.deleteById(idTeam);
    }
}
