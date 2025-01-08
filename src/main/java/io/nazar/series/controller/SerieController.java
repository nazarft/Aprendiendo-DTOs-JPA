package io.nazar.series.controller;

import io.nazar.series.domain.dto.SerieDTO;
import io.nazar.series.domain.model.Actor;
import io.nazar.series.domain.model.Director;
import io.nazar.series.domain.model.Screenwriter;
import io.nazar.series.domain.model.Serie;
import io.nazar.series.domain.service.SerieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieController {
    private SerieService serieService;

    public SerieController(SerieService serieService) {
        this.serieService = serieService;
    }

    @GetMapping()
    public List<Serie> findAll() {
       return serieService.findAll();
    }
    @GetMapping("/{id}")
    public SerieDTO findByIdWithCharacters(@PathVariable Long id) {
        return serieService.serieWithCharacters(id);
    }



}
