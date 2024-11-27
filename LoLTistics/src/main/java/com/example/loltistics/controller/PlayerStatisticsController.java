package com.example.loltistics.controller;

import com.example.loltistics.model.PlayerStatistics;
import com.example.loltistics.service.PlayerStatisticsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.loltistics.dto.PlayerStatisticsDTO;

@RestController
@RequestMapping("/player-stats")
public class PlayerStatisticsController {

    @Autowired
    private PlayerStatisticsService playerStatisticsService;

    @PostMapping
    public ResponseEntity<PlayerStatistics> createStatistics(@RequestBody @Valid PlayerStatisticsDTO dto) {
        PlayerStatistics stats = playerStatisticsService.createPlayerStatistics(dto);
        return ResponseEntity.status(HttpStatu  s.CREATED).body(stats);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlayerStatistics> getPlayerStatistics(@PathVariable Long id) {
        PlayerStatistics playerStatistics = playerStatisticsService.getPlayerStatisticsById(id);
        return ResponseEntity.ok(playerStatistics);
    }

    // Update - Atualizar estatísticas de um jogador
    @PutMapping("/{id}")
    public ResponseEntity<PlayerStatistics> updatePlayerStatistics(@PathVariable Long id, @RequestBody PlayerStatisticsDTO playerStatisticsDTO) {
        PlayerStatistics updatedPlayerStatistics = playerStatisticsService.updatePlayerStatistics(id, playerStatisticsDTO);
        return ResponseEntity.ok(updatedPlayerStatistics);
    }

    // Delete - Deletar estatísticas de um jogador
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayerStatistics(@PathVariable Long id) {
        playerStatisticsService.deletePlayerStatistics(id);
        return ResponseEntity.noContent().build();
    }
}