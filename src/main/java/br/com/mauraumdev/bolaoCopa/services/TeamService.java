package br.com.mauraumdev.bolaoCopa.services;

import br.com.mauraumdev.bolaoCopa.dto.TeamDto;
import br.com.mauraumdev.bolaoCopa.dto.TournamenDto;
import br.com.mauraumdev.bolaoCopa.repository.TeamsRepository;
import br.com.mauraumdev.bolaoCopa.model.Teams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeamService {
    @Autowired
    TeamsRepository teamsRepository;

    public void saveTeam(Teams team){
       teamsRepository.save(team);
    }
    public Teams loadTeamByName(String teamName){
        return  teamsRepository.findByTeamName(teamName);
    }

    public Teams loadTeamById(long idTeam){
        return teamsRepository.findById(idTeam);
    }

    public String deleteTeam(Long idTeam){
        teamsRepository.deleteById(idTeam);
        return "Time deletado com sucesso ";
    }

    public List<TeamDto> listTeams(){
        return TeamDto.converter(teamsRepository.findAll());

    }

    public  List<TournamenDto> listTournaments(Teams teams){
        return TournamenDto.converter(teams.getTournamentList());
    }
}
