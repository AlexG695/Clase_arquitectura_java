package com.base_player.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Audited.Table;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "player")
public class PlayerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", columnDefinition = "VARCHAR(80) NOT NULL")
    private String name;

    @Column(name = "jersey", columnDefinition = "VARCHAR(80)")
    private String jersey;

    @Column(name = "country", columnDefinition = "VARCHAR(80)")
    private String country;

    @Column(name = "position", columnDefinition = "VARCHAR(80)")
    private String position;

    public PlayerModel toDto() {
        return PlayerModel.builder()
            .id(this.id)
            .name(this.name)
            .jersey(this.jersey)
            .country(this.country)
            .position(this.position)
            .build();
    }
}
