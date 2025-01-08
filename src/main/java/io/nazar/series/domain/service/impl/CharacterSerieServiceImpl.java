package io.nazar.series.domain.service.impl;

import io.nazar.series.domain.model.CharacterSerie;
import io.nazar.series.domain.repository.CharacterSerieRepository;
import io.nazar.series.domain.service.CharacterSerieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CharacterSerieServiceImpl implements CharacterSerieService {
    private final CharacterSerieRepository characterSerieRepository;
    @Override
    public List<CharacterSerie> findAllBySerieId(Long serieId) {
        return characterSerieRepository.findAllBySerieId(serieId);
    }
}
