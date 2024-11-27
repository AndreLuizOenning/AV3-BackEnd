package com.example.loltistics.dto;

import lombok.*;

import jakarta.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MatchDTO {

    @NotEmpty(message = "O resultado da partida é obrigatório")
    private String result;

    @NotEmpty(message = "A data da partida é obrigatória")
    private String date;
}