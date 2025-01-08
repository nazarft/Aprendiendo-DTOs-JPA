package io.nazar.series.persistence.repository.impl;

import io.nazar.series.domain.model.Serie;
import io.nazar.series.domain.repository.SerieRepository;
import io.nazar.series.persistence.dao.impl.jpa.SerieDaoJpa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RequiredArgsConstructor
public class SerieRepositoryImpl implements SerieRepository {

    private final SerieDaoJpa serieDaoJpa;

    @Override
    public List<Serie> findAll() {
        return serieDaoJpa.findAll();
    }

    @Override
    public Serie findById(Long id) {
        return serieDaoJpa.findById(id);
    }
}
