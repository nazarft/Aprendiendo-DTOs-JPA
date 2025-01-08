package io.nazar.series.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SerieDTO {
    private String name;
    private float rating;
    private List<CharacterSerieDTO> characters;
}