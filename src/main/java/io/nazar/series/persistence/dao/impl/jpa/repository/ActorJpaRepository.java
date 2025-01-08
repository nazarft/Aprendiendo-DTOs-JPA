package io.nazar.series.persistence.dao.impl.jpa.repository;

import io.nazar.series.persistence.dao.impl.jpa.entity.ActorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorJpaRepository extends JpaRepository<ActorEntity, Long> {
}
