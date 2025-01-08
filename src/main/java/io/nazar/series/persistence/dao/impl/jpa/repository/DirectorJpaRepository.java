package io.nazar.series.persistence.dao.impl.jpa.repository;

import io.nazar.series.persistence.dao.impl.jpa.entity.DirectorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorJpaRepository extends JpaRepository<DirectorEntity, Long> {
}
