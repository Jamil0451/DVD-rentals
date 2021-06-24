package info.cognit.dvdrental.controller;


import info.cognit.dvdrental.domain.entity.FilmEntity;
import info.cognit.dvdrental.domain.entity.RentalEntity;
import info.cognit.dvdrental.domain.repository.FilmRepo;
import info.cognit.dvdrental.dto.FilmRequest;
import info.cognit.dvdrental.dto.Response;
import info.cognit.dvdrental.dto.ResponseStatus;
import info.cognit.dvdrental.service.FilmService;
import info.cognit.dvdrental.validator.FilmValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @Autowired
    FilmRepo filmRepo;

    @Autowired
    private FilmValidator filmValidator;

    @GetMapping("/all")
    public List<FilmEntity> getAll() {
        return filmService.getAllDvds();
    }

    @GetMapping(value = "/all", params = {"title", "releaseYear"})
    public ResponseEntity<Response> getAllDvdByTitleAndReleaseYear(@RequestParam("title") String title, @RequestParam("releaseYear") Integer releaseYear) {

        ResponseEntity<Response> responseEntity = filmValidator.validateGetAllDvdByTitleAndReleaseYear(title, releaseYear);
        if (responseEntity.getBody().getStatus() == ResponseStatus.ERROR) {
            return responseEntity;
        }
        List<FilmEntity> film = filmService.getAllDvdByTitleAndReleaseYear(title, releaseYear);
        Response<List<FilmEntity>> response = new Response<>();
        response.setBody(film);
        response.setMessage("The following movie exists!");
        response.setStatus(ResponseStatus.SUCCESS);

        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    @GetMapping("/{filmId}")
    public FilmEntity findDvdsById(@PathVariable Long filmId) {

        return filmService.getDvdsById(filmId);
    }
    @GetMapping("/add")
    public ResponseEntity<Response<RentalEntity>> add(@RequestBody FilmRequest filmRequest) {
        Response<RentalEntity> response = filmValidator.validateRequiredFields(filmRequest);
        if (response.getStatus() != ResponseStatus.ERROR) {
            response = filmService.addRental(filmRequest);
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }



}
