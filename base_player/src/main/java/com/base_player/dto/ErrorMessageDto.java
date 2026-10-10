package com.base_player.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorMessageDto {

    private String message;
    private HttpStatus status;

    public ErrorMessageDto(String message) {
        this.message = message;
        this.status = status;
    }
}
