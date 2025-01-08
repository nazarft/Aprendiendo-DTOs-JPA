package io.nazar.series.domain.repository;

import io.nazar.series.domain.model.Serie;

import java.util.List;

public interface SerieRepository {
    List<Serie> findAll();
    Serie findById(Long id);
}
