package info.cognit.dvdrental.service.impl;

import info.cognit.dvdrental.domain.entity.FilmEntity;
import info.cognit.dvdrental.domain.repository.CustomerRepo;
import info.cognit.dvdrental.domain.repository.FilmRepo;
import info.cognit.dvdrental.service.FilmService;
import info.cognit.dvdrental.validator.FilmValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmRepo filmRepo;

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private FilmValidator filmValidator;

    @Override
    public List<FilmEntity> getAllDvds() {
        List<FilmEntity> dvds = new ArrayList<>();
        Iterable<FilmEntity> all = filmRepo.findAll();
        all.forEach(filmEntity -> dvds.add(filmEntity));
        return dvds;
    }

    @Override
    public FilmEntity getDvdsById(Long filmId) {
        Optional<FilmEntity> byId = filmRepo.findById(filmId);
        return byId.get();
    }

    @Override
    public List<FilmEntity> getAllDvdByTitleAndReleaseYear(String title, Integer releaseYear) {
        return filmRepo.findAllDvdByTitleAndReleaseYear(title, releaseYear);
    }

    @Override


}
