package com.base_player.controller;

import com.base_player.dto.PlayerDto;
import com.base_player.service.PlayerService;
import java.util.List;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/player")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllPlayers() {
        List<PlayerDto> players = playerService.getAllPlayers();
        return ResponseEntity.ok(players);
    }

    @PostMapping("/")
    public ResponseEntity<?> createPlayer(@RequestBody PlayerDto playerDto) {
        Integer id = playerService.createPlayer(playerDto);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
