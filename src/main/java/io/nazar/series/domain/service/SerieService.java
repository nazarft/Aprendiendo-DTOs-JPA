package io.nazar.series.domain.service;

import io.nazar.series.domain.dto.SerieDTO;
import io.nazar.series.domain.model.Serie;

import java.util.List;

public interface SerieService {
    List<Serie> findAll();
    Serie findById(Long id);
    SerieDTO serieWithCharacters(Long id);
}
