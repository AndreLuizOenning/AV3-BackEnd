package com.example.loltistics.service;

import com.example.loltistics.dto.MatchDTO;
import com.example.loltistics.model.Match;
import com.example.loltistics.model.Player;
import com.example.loltistics.repository.MatchRepository;
import com.example.loltistics.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    @Autowired
    private PlayerRepository playerRepository;

    public Match createMatch(MatchDTO matchDTO) {
        Player player = playerRepository.findByNickname(matchDTO.getResult());
        Match match = new Match();
        match.setResult(matchDTO.getResult());
        match.setDate(matchDTO.getDate());
        match.setPlayer(player);
        return matchRepository.save(match);
    }

    public Match getMatchById(Long id) {
        return matchRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Partida não encontrada"));
    }

    public void deleteMatch(Long id) {
        Match match = matchRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Partida não encontrada"));

        matchRepository.delete(match);
    }
}