package info.cognit.dvdrental.service;

import info.cognit.dvdrental.domain.entity.FilmEntity;
import info.cognit.dvdrental.dto.FilmRequest;

public class BaseTest {
    public FilmEntity getFilmEntityAsResponse() {
        FilmEntity film = new FilmEntity();
        film.setFilmId(2L);
        film.setLanguageId(1L);
        film.setTitle("ACE GOLDFINGER");
        film.setDescription("A Astounding Epistle of a Database Administrator And a Explorer who must Find a Car in Ancient China");
        film.setReleaseYear(2006);
        return film;
    }

    public FilmRequest getFilmRequest() {

        FilmEntity filmEntity = new FilmEntity();
        filmEntity.setTitle("ACE GOLDFINGER");
        filmEntity.setReleaseYear(2006);
        FilmRequest request = new FilmRequest();
        request.setFilm(filmEntity);

        return request;

    }
}
