package io.nazar.series.domain.repository;

import io.nazar.series.domain.model.CharacterSerie;

import java.util.List;

public interface CharacterSerieRepository {

    List<CharacterSerie> findAllBySerieId(Long serieId);
}
