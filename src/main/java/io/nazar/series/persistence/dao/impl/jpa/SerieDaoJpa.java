package io.nazar.series.persistence.dao.impl.jpa;

import io.nazar.series.domain.model.Serie;
import io.nazar.series.persistence.dao.impl.jpa.mapper.SerieJpaMapper;
import io.nazar.series.persistence.dao.impl.jpa.repository.SerieJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
@Primary
@RequiredArgsConstructor
public class SerieDaoJpa {

    private final  SerieJpaRepository serieJpaRepository;

    public List<Serie> findAll() {
        return serieJpaRepository.findAll()
                .stream()
                .map(serieEntity -> SerieJpaMapper.INSTANCE.toSerie(serieEntity))
                .toList();
    }
    public Serie findById(Long id) {
        return serieJpaRepository.findById(id)
                .map(serieEntity -> SerieJpaMapper.INSTANCE.toSerie(serieEntity))
                .orElseThrow(() ->  new RuntimeException("Serie not found"));
    }

}
