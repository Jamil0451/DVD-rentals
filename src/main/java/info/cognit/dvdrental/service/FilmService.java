package info.cognit.dvdrental.service;

import info.cognit.dvdrental.domain.entity.FilmEntity;
import info.cognit.dvdrental.domain.entity.RentalEntity;
import info.cognit.dvdrental.dto.FilmRequest;
import info.cognit.dvdrental.dto.Response;
import org.w3c.dom.stylesheets.LinkStyle;
import org.springframework.stereotype.Service;


import java.util.List;

public interface FilmService {

    List<FilmEntity> getAllDvds();

    FilmEntity getDvdsById(Long filmId);

    List<FilmEntity> getAllDvdByTitleAndReleaseYear(String title, Integer releaseYear);

    Response<RentalEntity> addRental(FilmRequest filmRequest);
}
