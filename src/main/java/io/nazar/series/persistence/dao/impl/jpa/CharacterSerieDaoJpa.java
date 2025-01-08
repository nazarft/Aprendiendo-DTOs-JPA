package io.nazar.series.persistence.dao.impl.jpa;

import io.nazar.series.domain.model.CharacterSerie;
import io.nazar.series.persistence.dao.impl.jpa.mapper.CharacterSerieJpaMapper;
import io.nazar.series.persistence.dao.impl.jpa.repository.CharacterSerieJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
@RequiredArgsConstructor
public class CharacterSerieDaoJpa {
    private final CharacterSerieJpaRepository characterSerieJpaRepository;

    public List<CharacterSerie> findAllBySerieId(Long serieId) {
        return characterSerieJpaRepository.findAllBySerieId(serieId)
                .stream()
                .map(characterSerieEntity -> CharacterSerieJpaMapper.INSTANCE.toCharacterSerie(characterSerieEntity))
                .toList();
}
}
