package info.cognit.dvdrental.service.impl;

import info.cognit.dvdrental.domain.entity.CustomerEntity;
import info.cognit.dvdrental.domain.entity.FilmEntity;
import info.cognit.dvdrental.domain.entity.RentalEntity;
import info.cognit.dvdrental.domain.repository.CustomerRepo;
import info.cognit.dvdrental.domain.repository.FilmRepo;
import info.cognit.dvdrental.domain.repository.RentalRepo;
import info.cognit.dvdrental.dto.FilmRequest;
import info.cognit.dvdrental.dto.Response;
import info.cognit.dvdrental.dto.ResponseStatus;
import info.cognit.dvdrental.service.FilmService;
import info.cognit.dvdrental.validator.FilmValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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
    private RentalRepo rentalRepo;

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
    public Response<RentalEntity> addRental(FilmRequest filmRequest) {
        Response<RentalEntity> response = new Response<>();

        // 1. Check if the customer exists in DB. if not then create.
        CustomerEntity customer = customerRepo.findByFirstNameAndLastName(filmRequest.getCustomer().getFirstName(),
                filmRequest.getCustomer().getLastName());

        // b. check if the customer exists, otherwise insert customer
        if (customer == null) {
            customer = customerRepo.save(filmRequest.getCustomer());       //insert the customer to DB
        }

        RentalEntity rental = rentalRepo.findReturnDate(filmRequest.getRental().getReturnDate());

        if (rental != null){
            response.setMessage("DVD is not available for rent");
            response.setStatus(ResponseStatus.ERROR);
            return response;
        }

        RentalEntity rentalEntity = buildNewRental(filmRequest, customer.getCustomerId(), rental.getInventoryId());
        rental = rentalRepo.save(rentalEntity);
        response.setBody(rental);
        response.setStatus(ResponseStatus.SUCCESS);
        return response;

    }

    private RentalEntity buildNewRental(FilmRequest filmRequest, Integer customerId, Integer inventoryId) {
        RentalEntity rentalEntity = new RentalEntity();
        rentalEntity.setRentalDate(LocalDateTime.now());
        rentalEntity.setCustomerId(customerId);
        rentalEntity.setReturnDate(LocalDateTime.now());
        rentalEntity.setInventoryId(inventoryId);
        return rentalEntity;
    }


}
