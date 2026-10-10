package com.base_player.util;

import com.base_player.dto.PlayerDto;
import com.base_player.exception.BusinessException;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Component;

@Component
public class ValidateUtil {

    public void validateName(PlayerDto playerDto) throws BusinessException {
        if (Strings.isBlank(playerDto.getName())) {
            throw new BusinessException("Name is empty");
        }
    }
}
