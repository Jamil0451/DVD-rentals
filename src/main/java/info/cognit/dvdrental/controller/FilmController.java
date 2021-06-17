package info.cognit.dvdrental.controller;


import info.cognit.dvdrental.domain.entity.FilmEntity;
import info.cognit.dvdrental.domain.repository.FilmRepo;
import info.cognit.dvdrental.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService filmService;
    @Autowired
    FilmRepo filmRepo;

    @GetMapping("/all")
    public List<FilmEntity> getAll() {
        return filmService.getAllDvds();
    }

    @GetMapping(value = "/all", params = {"title", "releaseYear"})
    public List<FilmEntity> getAllFilmByTitleAndReleaseYear(@RequestParam("title") String title, @RequestParam("releaseYear") Integer releaseYear) {

        return filmService.getAllFilmByTitleAndReleaseYear(title, releaseYear);
    }

    @GetMapping("/{filmId}")
    public FilmEntity findDvdsById(@PathVariable Long filmId) {

        return filmService.getDvdsById(filmId);
    }

}
