package com.example.loltistics.repository;

import com.example.loltistics.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    Player findByNickname(String nickname);
}