package info.cognit.dvdrental.dto;

import info.cognit.dvdrental.domain.entity.*;
import lombok.Data;

@Data
public class FilmRequest {
    private CustomerEntity customer;
    private FilmEntity film;
    private PaymentEntity payment;
    private InventoryEntity inventory;
    private RentalEntity rental;

}
