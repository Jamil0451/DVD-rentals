package info.cognit.dvdrental.domain.repository;

import info.cognit.dvdrental.domain.entity.RentalEntity;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;

public interface RentalRepo extends CrudRepository<RentalEntity, Long> {
    RentalEntity findByReturnDate(LocalDateTime returnDate);
}
