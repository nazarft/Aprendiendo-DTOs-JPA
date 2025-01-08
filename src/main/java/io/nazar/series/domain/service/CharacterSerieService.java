package io.nazar.series.domain.service;

import io.nazar.series.domain.model.CharacterSerie;

import java.util.List;

public interface CharacterSerieService {
    List<CharacterSerie> findAllBySerieId(Long serieId);
}
