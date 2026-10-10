package com.base_player.controller;

import com.base_player.dto.PlayerDto;
import com.base_player.dto.PlayerRsDto;
import com.base_player.exception.BusinessException;
import com.base_player.service.PlayerService;
import com.base_player.util.ValidateUtil;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/player")
public class PlayerController {

    private final PlayerService playerService;
    private final ValidateUtil validateUtil;

    public PlayerController(
        PlayerService playerService,
        ValidateUtil validateUtil
    ) {
        this.playerService = playerService;
        this.validateUtil = validateUtil;
    }

    @GetMapping
    public ResponseEntity<?> getAllPlayers() {
        List<PlayerDto> players = playerService.getAllPlayers();
        return ResponseEntity.ok(players);
    }

    @PostMapping
    public ResponseEntity<?> createPlayer(@RequestBody PlayerDto playerDto)
        throws BusinessException {
        validateUtil.validateName(playerDto);
        PlayerRsDto playerRsDto = playerService.createPlayer(playerDto);
        return new ResponseEntity<>(playerRsDto, HttpStatus.OK);
    }
}
