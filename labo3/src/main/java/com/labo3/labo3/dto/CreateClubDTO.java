package com.labo3.labo3.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class CreateClubDTO {
    @NotEmpty
    private String clubName;
    @NotEmpty
    private String country;
    @NotEmpty
    private String coach;
    @NotEmpty
    private String titles;
}
