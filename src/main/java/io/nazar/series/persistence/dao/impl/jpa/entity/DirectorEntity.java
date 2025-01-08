package io.nazar.series.persistence.dao.impl.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "directors")
public class DirectorEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;
    @Column(name = "other_series")
    private String otherSeries;
}
