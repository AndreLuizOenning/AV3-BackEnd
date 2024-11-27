package com.example.loltistics.service;


import com.example.loltistics.dto.PlayerStatisticsDTO;
import com.example.loltistics.model.PlayerStatistics;
import com.example.loltistics.repository.PlayerStatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerStatisticsService {

    @Autowired
    private PlayerStatisticsRepository playerStatisticsRepository;


    public PlayerStatistics createPlayerStatistics(PlayerStatisticsDTO playerStatisticsDTO) {
        PlayerStatistics playerStatistics = new PlayerStatistics();
        playerStatistics.setKda(playerStatisticsDTO.getKda());
        playerStatistics.setWinRate(playerStatisticsDTO.getWinRate());
        playerStatistics.setCsPerMinute(playerStatisticsDTO.getCsPerMinute());
        playerStatistics.setGoldPerMinute(playerStatisticsDTO.getGoldPerMinute());

        return playerStatisticsRepository.save(playerStatistics);
    }

    // Read - Obter estatísticas de um jogador por seu ID
    public PlayerStatistics getPlayerStatisticsById(Long id) {
        Optional<PlayerStatistics> playerStatistics = playerStatisticsRepository.findById(id);
        return playerStatistics.orElseThrow(() -> new IllegalArgumentException("Estatísticas não encontradas"));
    }

    // Update - Atualizar estatísticas de um jogador
    public PlayerStatistics updatePlayerStatistics(Long id, PlayerStatisticsDTO playerStatisticsDTO) {
        PlayerStatistics existingStats = playerStatisticsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Estatísticas não encontradas"));

        existingStats.setKda(playerStatisticsDTO.getKda());
        existingStats.setWinRate(playerStatisticsDTO.getWinRate());
        existingStats.setCsPerMinute(playerStatisticsDTO.getCsPerMinute());
        existingStats.setGoldPerMinute(playerStatisticsDTO.getGoldPerMinute());

        return playerStatisticsRepository.save(existingStats);
    }

    // Delete - Deletar estatísticas de um jogador
    public void deletePlayerStatistics(Long id) {
        PlayerStatistics playerStatistics = playerStatisticsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Estatísticas não encontradas"));
        playerStatisticsRepository.delete(playerStatistics);
    }


}
