package io.nazar.series.persistence.dao.impl.jpa.repository;

import io.nazar.series.persistence.dao.impl.jpa.entity.ScreenwriterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreenwriterJpaRepository extends JpaRepository<ScreenwriterEntity, Long> {
}
