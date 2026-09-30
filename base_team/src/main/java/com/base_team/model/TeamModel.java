package com.base_team.model;

import com.base_team.dto.TeamDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Audited.Table;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "team")
public class TeamModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", length = 80)
    private String nombre;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;

    @Column(name = "num_jugadores")
    private Integer numJugadores;

    @Column(name = "ganadas")
    private Integer ganadas;

    @Column(name = "perdidas")
    private Integer perdidas;

    public TeamDto toDto() {
        return TeamDto.builder()
            .id(this.id)
            .nombre(this.nombre)
            .fechaInicio(this.fechaInicio)
            .numJugadores(this.numJugadores)
            .ganadas(this.ganadas)
            .perdidas(this.perdidas)
            .build();
    }
}
