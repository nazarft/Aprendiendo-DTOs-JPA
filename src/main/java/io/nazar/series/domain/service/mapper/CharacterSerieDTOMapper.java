package io.nazar.series.domain.service.mapper;

import io.nazar.series.domain.dto.CharacterSerieDTO;
import io.nazar.series.domain.model.CharacterSerie;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CharacterSerieDTOMapper {
    CharacterSerieDTOMapper INSTANCE = Mappers.getMapper(CharacterSerieDTOMapper.class);

    CharacterSerieDTO toDTO(CharacterSerie characterSerie);
}
