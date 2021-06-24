package info.cognit.dvdrental.dto;

import info.cognit.dvdrental.domain.entity.CustomerEntity;
import info.cognit.dvdrental.domain.entity.FilmEntity;
import info.cognit.dvdrental.domain.entity.PaymentEntity;
import lombok.Data;

@Data
public class FilmRequest {
    private CustomerEntity customer;
    private FilmEntity film;
    private PaymentEntity payment;

}
