package com.cmp_student.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerDto {

    private Integer id;
    private String name;
    private String jersey;
    private String country;
    private String position;
}
