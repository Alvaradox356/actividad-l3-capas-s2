package com.labo3.labo3.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseDTO {
    private int id;
    private String name;
    private String country;
    private String coach;
    private String titles;
}
