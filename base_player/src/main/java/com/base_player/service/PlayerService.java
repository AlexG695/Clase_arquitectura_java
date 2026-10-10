package com.base_player.service;

import com.base_player.dto.PlayerDto;
import com.base_player.dto.PlayerRsDto;
import com.base_player.repository.PlayerRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<PlayerDto> getAllPlayers() {
        return playerRepository
            .findAll()
            .stream()
            .map(player -> PlayerDto.fromModel(player))
            .collect(Collectors.toList());
    }

    public PlayerRsDto createPlayer(PlayerDto playerDto) {
        Integer id = playerRepository.save(playerDto.toModel()).getId();
        PlayerRsDto playerRsDto = PlayerRsDto.builder()
            .message("GG")
            .id(id)
            .build();
        return playerRsDto;
    }
}
