package com.example.loltistics.service;

import com.example.loltistics.dto.PlayerDTO;
import com.example.loltistics.model.Player;
import com.example.loltistics.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public Player createPlayer(PlayerDTO playerDTO) {
        Player player = new Player();
        player.setNickname(playerDTO.getNickname());
        player.setRole(playerDTO.getRole());
        return playerRepository.save(player);
    }

    public Player getPlayerByNickname(String nickname) {
        return playerRepository.findByNickname(nickname);
    }
    public Player updatePlayer(String nickname, PlayerDTO playerDTO) {
        Player player = playerRepository.findByNickname(nickname);

        player.setNickname(playerDTO.getNickname());
        player.setRole(playerDTO.getRole());

        return playerRepository.save(player);
    }
    public void deletePlayer(String nickname) {
        Player player = playerRepository.findByNickname(nickname);
        playerRepository.delete(player);
    }
}