package br.com.mauraumdev.bolaoCopa.controller;

import br.com.mauraumdev.bolaoCopa.dto.TeamDto;
import br.com.mauraumdev.bolaoCopa.dto.TournamenDto;
import br.com.mauraumdev.bolaoCopa.model.Teams;
import br.com.mauraumdev.bolaoCopa.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/betapi/teams")
public class TeamsController {

    @Autowired
    TeamService teamService;

    @GetMapping
    public List<TeamDto> listTeams(){return teamService.listTeams();}

    @PostMapping
    public void saveTeam(@RequestBody Teams newTeams){
        teamService.saveTeam(newTeams);
    }

    @GetMapping("/{id}")
    public Teams selectTeam(@PathVariable(value ="id") long idTeam){
        return teamService.loadTeamById(idTeam);
    }

    @GetMapping("/={teamName}")
    public Teams selectTeamsByName(@PathVariable(value="teamName")String teamName){return teamService.loadTeamByName(teamName);}

    @DeleteMapping("/{id}")
    public String deleteTeamById(@PathVariable(value = "id") long idTeam){
       return teamService.deleteTeam(idTeam);
    }
    @GetMapping("/tournaments/{id}")
    public List<TournamenDto>allTournamentsForThisTeam(@PathVariable(value ="id")long idTeam){
        return teamService.listTournaments(teamService.loadTeamById(idTeam));
    }
}
