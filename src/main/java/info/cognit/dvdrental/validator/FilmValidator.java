package info.cognit.dvdrental.validator;

import info.cognit.dvdrental.dto.Response;
import info.cognit.dvdrental.dto.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class FilmValidator {
    public ResponseEntity<Response> validateGetAllDvdByTitleAndReleaseYear(String title, Integer releaseYear) {

        Response response = new Response();
        if (title == null || title.isEmpty()) {
            response.setStatus(ResponseStatus.ERROR);
            response.setMessage("Title cannot be null, please enter a valid Title.");

        } else if (releaseYear == null) {
            response.setStatus(ResponseStatus.ERROR);
            response.setMessage("ReleaseYear cannot be null, please enter a valid Release Year.");

        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
