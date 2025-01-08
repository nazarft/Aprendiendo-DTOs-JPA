package io.nazar.series.persistence.dao.impl.jpa.mapper;

import io.nazar.series.domain.model.CharacterSerie;
import io.nazar.series.persistence.dao.impl.jpa.entity.CharacterSerieEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {SerieJpaMapper.class, ActorJpaMapper.class})
public interface CharacterSerieJpaMapper {
    CharacterSerieJpaMapper INSTANCE = Mappers.getMapper(CharacterSerieJpaMapper.class);
    CharacterSerie toCharacterSerie(CharacterSerieEntity characterSerieEntity);
    CharacterSerieEntity toCharacterSerieEntity(CharacterSerie characterSerie);
}
