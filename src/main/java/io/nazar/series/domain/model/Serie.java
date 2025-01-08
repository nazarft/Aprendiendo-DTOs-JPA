package io.nazar.series.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Serie {
    private Long id;
    private String name;
    private String genre;
    private LocalDate releaseDate;
    private float rating;
    private int duration;
    private List<Actor> actors;
    private List<Director> directors;
    private List<Screenwriter> screenwriters;
}
