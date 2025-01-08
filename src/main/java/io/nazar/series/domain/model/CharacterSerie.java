package io.nazar.series.domain.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterSerie {
    private Long id;
    private Serie serie;
    private Actor actor;
    private String name;
    private String role;
    private String biography;
}
