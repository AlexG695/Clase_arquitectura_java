package com.base_player.dto;

import com.base_player.model.PlayerModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerDto {

    private Integer id;
    private String name;
    private String jersey;
    private String country;
    private String position;

    public static PlayerDto fromModel(PlayerModel player) {
        if (player == null) {
            return null;
        }
        return PlayerDto.builder()
            .id(player.getId())
            .name(player.getName())
            .jersey(player.getJersey())
            .country(player.getCountry())
            .position(player.getPosition())
            .build();
    }

    public PlayerModel toModel() {
        return PlayerModel.builder()
            .id(this.id)
            .name(this.name)
            .jersey(this.jersey)
            .country(this.country)
            .position(this.position)
            .build();
    }
}
