package io.nazar.series.persistence.dao.impl.jpa.entity;

import io.nazar.series.domain.model.Actor;
import io.nazar.series.domain.model.Serie;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "characters_series")
public class CharacterSerieEntity {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name = "series_id")
    private SerieEntity serie;
    @ManyToOne
    @JoinColumn(name = "actor_id")
    private ActorEntity actor;
    private String name;
    private String role;
    private String biography;
}
