package com.example.loltistics.repository;

import com.example.loltistics.model.PlayerStatistics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerStatisticsRepository extends JpaRepository<PlayerStatistics, Long> {
}
