package io.nazar.series.domain.service.mapper;

import io.nazar.series.domain.dto.SerieDTO;
import io.nazar.series.domain.model.Serie;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {CharacterSerieDTOMapper.class})
public interface SerieDTOMapper {
    SerieDTOMapper INSTANCE = Mappers.getMapper(SerieDTOMapper.class);

    SerieDTO toDTO(Serie serie);
}
