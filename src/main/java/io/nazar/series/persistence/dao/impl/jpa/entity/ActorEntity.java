package io.nazar.series.persistence.dao.impl.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "actors")
public class ActorEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;
    private String nationality;
    private String awards;
}
