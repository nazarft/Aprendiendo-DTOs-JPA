package io.nazar.series.persistence.dao.impl.jpa.mapper;

import io.nazar.series.domain.model.Director;
import io.nazar.series.persistence.dao.impl.jpa.entity.DirectorEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DirectorJpaMapper {
    DirectorJpaMapper INSTANCE = Mappers.getMapper(DirectorJpaMapper.class);
    Director toDirector(DirectorEntity directorEntity);
    DirectorEntity toDirectorEntity(Director director);
}
