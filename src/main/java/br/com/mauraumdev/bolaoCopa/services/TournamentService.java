package br.com.mauraumdev.bolaoCopa.services;

import br.com.mauraumdev.bolaoCopa.dto.GameDto;
import br.com.mauraumdev.bolaoCopa.dto.TournamenDto;
import br.com.mauraumdev.bolaoCopa.model.Tournament;
import br.com.mauraumdev.bolaoCopa.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TournamentService {

    @Autowired
    TournamentRepository tournamentRepository;

    public void saveTournament(Tournament tournament){tournamentRepository.save(tournament);}

    public List<TournamenDto> listAllTournament(){return TournamenDto.converter(tournamentRepository.findAll());}

    public Tournament findTournamentById(long id){return tournamentRepository.findById(id);}

    public String deleteTournamentById(long id){tournamentRepository.deleteById(id); return "Deletado com sucesso";}

    public Tournament findTournamentByName(String nameTournament){return tournamentRepository.findByName(nameTournament);}

    public List<String> loadAllTournamentGames(long IdTournament){
        Tournament tournament = findTournamentById(IdTournament);
        List<String> gamesInTournament = new ArrayList<>();
        int gameNumber = 0;
        while (tournament.getGameTable().size() > gameNumber){
            gamesInTournament.add(GameDto.converteGame(tournament.getGameTable().get(gameNumber)));
            gameNumber++;
        }

        return gamesInTournament;
    }

}
