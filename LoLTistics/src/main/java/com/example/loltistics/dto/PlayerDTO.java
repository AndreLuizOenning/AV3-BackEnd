package com.example.loltistics.dto;

import lombok.*;

import jakarta.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDTO {

    @NotEmpty(message = "O nickname é obrigatório")
    private String nickname;

    @NotEmpty(message = "O role é obrigatório")
    private String role;
}