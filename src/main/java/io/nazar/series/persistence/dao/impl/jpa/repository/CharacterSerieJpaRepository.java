package io.nazar.series.persistence.dao.impl.jpa.repository;

import io.nazar.series.persistence.dao.impl.jpa.entity.CharacterSerieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharacterSerieJpaRepository extends JpaRepository<CharacterSerieEntity, Long> {
    List<CharacterSerieEntity> findAllBySerieId(Long serieId);
}
