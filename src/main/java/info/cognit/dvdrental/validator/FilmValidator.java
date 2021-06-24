package info.cognit.dvdrental.validator;

import info.cognit.dvdrental.domain.entity.RentalEntity;
import info.cognit.dvdrental.dto.FilmRequest;
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

    public Response<RentalEntity> validateRequiredFields(FilmRequest filmRequest) {
        Response<RentalEntity> response = new Response<>();

        if (filmRequest.getCustomer() == null || isEmpty(filmRequest.getCustomer().getFirstName()) || isEmpty(filmRequest.getCustomer().getLastName())) {
            response.setStatus(ResponseStatus.ERROR);
            response.setMessage("Customer first name and last name required");
        }
        return response;
    }

    private static boolean isEmpty (String value) {
        if (value == null || value.isEmpty()) {
            return true;
        }
        return false;
    }
}
