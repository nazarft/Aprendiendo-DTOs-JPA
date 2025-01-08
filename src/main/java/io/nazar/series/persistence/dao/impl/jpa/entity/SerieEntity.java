package io.nazar.series.persistence.dao.impl.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "series")
public class SerieEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String genre;
    @Column(name = "release_date")
    private LocalDate releaseDate;
    private float rating;
    private int duration;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "series_actors",
            joinColumns = @JoinColumn(name = "series_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id")
    )
    private List<ActorEntity> actors;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "series_directors",
            joinColumns = @JoinColumn(name = "series_id"),
            inverseJoinColumns = @JoinColumn(name = "director_id")
    )
    private List<DirectorEntity> directors;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "series_screenwriters",
            joinColumns = @JoinColumn(name = "series_id"),
            inverseJoinColumns = @JoinColumn(name = "screenwriter_id")
    )
    private List<ScreenwriterEntity> screenwriters;
}
