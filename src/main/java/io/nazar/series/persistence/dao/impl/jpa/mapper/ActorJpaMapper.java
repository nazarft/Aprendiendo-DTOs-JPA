package io.nazar.series.persistence.dao.impl.jpa.mapper;

import io.nazar.series.domain.model.Actor;
import io.nazar.series.persistence.dao.impl.jpa.entity.ActorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ActorJpaMapper {
    ActorJpaMapper INSTANCE = Mappers.getMapper(ActorJpaMapper.class);

    Actor toActor(ActorEntity actorEntity);
    ActorEntity toActorEntity(Actor actor);
}
