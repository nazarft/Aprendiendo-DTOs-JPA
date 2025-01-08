package io.nazar.series.domain.service.impl;

import io.nazar.series.domain.dto.CharacterSerieDTO;
import io.nazar.series.domain.dto.SerieDTO;
import io.nazar.series.domain.model.CharacterSerie;
import io.nazar.series.domain.model.Serie;
import io.nazar.series.domain.repository.CharacterSerieRepository;
import io.nazar.series.domain.repository.SerieRepository;
import io.nazar.series.domain.service.SerieService;
import io.nazar.series.domain.service.mapper.CharacterSerieDTOMapper;
import io.nazar.series.domain.service.mapper.SerieDTOMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SerieServiceImpl implements SerieService {

    private final SerieRepository serieRepository;
    private final CharacterSerieRepository characterSerieRepository;

    @Override
    public List<Serie> findAll() {
        return serieRepository.findAll();
    }

    @Override
    public Serie findById(Long id) {
        return serieRepository.findById(id);
    }

    @Override
    public SerieDTO serieWithCharacters(Long id) {
        Serie serie = serieRepository.findById(id);
        SerieDTO serieDTO = SerieDTOMapper.INSTANCE.toDTO(serie);
        List<CharacterSerie> characters = characterSerieRepository.findAllBySerieId(id);
        List<CharacterSerieDTO> characterSerieDTOS = characters.stream()
                .map(characterSerie -> CharacterSerieDTOMapper.INSTANCE.toDTO(characterSerie))
                .toList();
        serieDTO.setCharacters(characterSerieDTOS);
        return serieDTO;
    }
}
