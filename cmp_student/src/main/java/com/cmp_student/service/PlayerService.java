package com.cmp_student.service;

import com.cmp_student.dto.PlayerDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class PlayerService {

    @Value("${base.url.player}")
    private String baseUrl;

    private final WebClient webClient;

    public PlayerService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Flux<PlayerDto> findAll() {
        return webClient
            .get()
            .uri(baseUrl)
            .retrieve()
            .bodyToFlux(PlayerDto.class);
    }
}
