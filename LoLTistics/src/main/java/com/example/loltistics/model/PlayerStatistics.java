package com.example.loltistics.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PlayerStatistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double kda;
    private Double winRate;
    private Double csPerMinute;
    private Double goldPerMinute;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getKda() {
        return kda;
    }

    public void setKda(Double kda) {
        this.kda = kda;
    }

    public Double getWinRate() {
        return winRate;
    }

    public void setWinRate(Double winRate) {
        this.winRate = winRate;
    }

    public Double getCsPerMinute() {
        return csPerMinute;
    }

    public void setCsPerMinute(Double csPerMinute) {
        this.csPerMinute = csPerMinute;
    }

    public Double getGoldPerMinute() {
        return goldPerMinute;
    }

    public void setGoldPerMinute(Double goldPerMinute) {
        this.goldPerMinute = goldPerMinute;
    }
}
