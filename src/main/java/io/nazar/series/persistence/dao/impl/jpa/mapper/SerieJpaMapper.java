package io.nazar.series.persistence.dao.impl.jpa.mapper;

import io.nazar.series.domain.model.Serie;
import io.nazar.series.persistence.dao.impl.jpa.entity.SerieEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ActorJpaMapper.class, DirectorJpaMapper.class, ScreenwriterJpaMapper.class})
public interface SerieJpaMapper {
    SerieJpaMapper INSTANCE = Mappers.getMapper(SerieJpaMapper.class);
    Serie toSerie(SerieEntity serieEntity);
    SerieEntity toSerieEntity(Serie serie);
}
