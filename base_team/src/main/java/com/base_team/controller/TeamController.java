package com.base_team.controller;

import com.base_team.dto.TeamDto;
import com.base_team.service.TeamService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/team")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        List<TeamDto> list = teamService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody TeamDto teamDto) {
        TeamDto saved = teamService.save(teamDto);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
}
