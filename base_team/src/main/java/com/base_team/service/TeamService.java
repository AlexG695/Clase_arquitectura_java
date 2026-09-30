package com.base_team.service;

import com.base_team.dto.TeamDto;
import com.base_team.model.TeamModel;
import com.base_team.repository.TeamRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<TeamDto> findAll() {
        return teamRepository.findAll().stream().map(TeamModel::toDto).toList();
    }

    public TeamDto save(TeamDto teamDto) {
        return teamRepository.save(teamDto.toModel()).toDto();
    }
}
