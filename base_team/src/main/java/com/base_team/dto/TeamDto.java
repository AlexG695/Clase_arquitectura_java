package com.base_team.dto;

import com.base_team.model.TeamModel;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeamDto {

    private Integer id;
    private String nombre;
    private LocalDate fechaInicio;
    private Integer numJugadores;
    private Integer ganadas;
    private Integer perdidas;

    public TeamModel toModel() {
        return TeamModel.builder()
            .id(this.id)
            .nombre(this.nombre)
            .fechaInicio(this.fechaInicio)
            .numJugadores(this.numJugadores)
            .ganadas(this.ganadas)
            .perdidas(this.perdidas)
            .build();
    }
}
