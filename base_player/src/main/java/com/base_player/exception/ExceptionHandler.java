package com.base_player.exception;

import com.base_player.dto.ErrorMessageDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(
        BusinessException.class
    )
    public ResponseEntity<?> handleBusinessException(BusinessException ex) {
        ErrorMessageDto errorMessageDto = ErrorMessageDto.builder()
            .message(ex.getMessage())
            .build();
        return new ResponseEntity<>(errorMessageDto, HttpStatus.BAD_REQUEST);
    }
}
