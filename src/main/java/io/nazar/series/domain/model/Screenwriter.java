package io.nazar.series.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Screenwriter {
    private Long id;
    private String name;
    private int age;
    private LocalDate birthDate;
}
