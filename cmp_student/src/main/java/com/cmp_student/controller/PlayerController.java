package com.cmp_student.controller;

import com.cmp_student.dto.PlayerDto;
import com.cmp_student.service.PlayerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("${player.url}")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public Flux<PlayerDto> findAll() {
        return playerService.findAll();
    }
}
