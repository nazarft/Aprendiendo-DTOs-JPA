package io.nazar.series.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Director {
    private Long id;
    private String name;
    private int age;
    private String otherSeries;
}
