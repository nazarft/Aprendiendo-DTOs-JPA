package io.nazar.series.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actor {
    private Long id;
    private String name;
    private int age;
    private String nationality;
    private String awards;
}
