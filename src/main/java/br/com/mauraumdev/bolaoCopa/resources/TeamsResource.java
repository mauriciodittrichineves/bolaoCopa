package br.com.mauraumdev.bolaoCopa.resources;

import br.com.mauraumdev.bolaoCopa.dto.TeamDto;
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
    public List<TeamDto> listTeams(){
        return TeamDto.converter(teamsRepository.findAll()) ;
    }
    @PostMapping("/teams")
    public Teams saveTeam(@RequestBody Teams teams){
        return teamsRepository.save(teams);
    }
    @GetMapping("teams/{id}")
    public Teams selectTeam(@PathVariable(value ="id") long idTeam){
        return teamsRepository.findById(idTeam);
    }
    @GetMapping("teams={teamName}")
    public Teams selectTeamsByName(@PathVariable(value="teamName")String teamName){
        return teamsRepository.findByTeamName(teamName);
    }
    @DeleteMapping("/teams/{id}")
    public void deleteTeamById(@PathVariable(value = "id") long idTeam){
        teamsRepository.deleteById(idTeam);
    }
}
