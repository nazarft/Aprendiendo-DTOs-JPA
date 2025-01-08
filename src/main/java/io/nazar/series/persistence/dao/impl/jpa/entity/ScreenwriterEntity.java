package io.nazar.series.persistence.dao.impl.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "screenwriters")
public class ScreenwriterEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;
    private LocalDate birthDate;
}
