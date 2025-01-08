package io.nazar.series.persistence.repository.impl;

import io.nazar.series.domain.model.CharacterSerie;
import io.nazar.series.domain.repository.CharacterSerieRepository;
import io.nazar.series.persistence.dao.impl.jpa.CharacterSerieDaoJpa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CharacterSerieRepositoryImpl implements CharacterSerieRepository {


    private final CharacterSerieDaoJpa characterSerieDaoJpa;

    @Override
    public List<CharacterSerie> findAllBySerieId(Long serieId) {
        return characterSerieDaoJpa.findAllBySerieId(serieId);
    }
}
