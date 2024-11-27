package com.example.loltistics.controller;

import com.example.loltistics.dto.PlayerDTO;
import com.example.loltistics.model.Player;
import com.example.loltistics.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping
    public ResponseEntity<Player> createPlayer(@RequestBody PlayerDTO playerDTO) {
        Player player = playerService.createPlayer(playerDTO);
        return ResponseEntity.ok(player);
    }

    @GetMapping("/{nickname}")
    public ResponseEntity<Player> getPlayer(@PathVariable String nickname) {
        Player player = playerService.getPlayerByNickname(nickname);
        return ResponseEntity.ok(player);
    }

    @PutMapping("/{nickname}")
    public ResponseEntity<Player> updatePlayer(@PathVariable String nickname, @RequestBody PlayerDTO playerDTO) {
        Player updatedPlayer = playerService.updatePlayer(nickname, playerDTO);
        return ResponseEntity.ok(updatedPlayer);
    }

    @DeleteMapping("/{nickname}")
    public ResponseEntity<Void> deletePlayer(@PathVariable String nickname) {
        playerService.deletePlayer(nickname);
        return ResponseEntity.noContent().build();
    }

}