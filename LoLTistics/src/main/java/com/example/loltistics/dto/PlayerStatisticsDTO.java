package com.example.loltistics.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class PlayerStatisticsDTO {

    @NotNull
    @Min(0)
    private Double kda;

    @NotNull
    @Min(0)
    private Double winRate;

    @NotNull
    @Min(0)
    private Double csPerMinute;

    @NotNull
    @Min(0)
    private Double goldPerMinute;

    // Getters and Setters
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
