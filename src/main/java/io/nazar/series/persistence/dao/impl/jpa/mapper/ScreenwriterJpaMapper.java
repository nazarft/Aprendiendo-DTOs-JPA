package io.nazar.series.persistence.dao.impl.jpa.mapper;

import io.nazar.series.domain.model.Screenwriter;
import io.nazar.series.persistence.dao.impl.jpa.entity.ScreenwriterEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ScreenwriterJpaMapper {
    ScreenwriterJpaMapper INSTANCE = Mappers.getMapper(ScreenwriterJpaMapper.class);
    Screenwriter toScreenwriter(ScreenwriterEntity screenwriterEntity);
    ScreenwriterEntity toScreenwriterEntity(Screenwriter screenwriter);
}
