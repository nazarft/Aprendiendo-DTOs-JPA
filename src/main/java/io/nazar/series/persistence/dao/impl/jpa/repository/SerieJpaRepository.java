package io.nazar.series.persistence.dao.impl.jpa.repository;

import io.nazar.series.persistence.dao.impl.jpa.entity.SerieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieJpaRepository extends JpaRepository<SerieEntity, Long> {
}
