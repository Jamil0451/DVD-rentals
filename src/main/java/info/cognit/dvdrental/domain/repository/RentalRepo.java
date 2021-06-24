package info.cognit.dvdrental.domain.repository;

import info.cognit.dvdrental.domain.entity.RentalEntity;
import org.springframework.data.repository.CrudRepository;

public interface RentalRepo extends CrudRepository<RentalEntity, Long> {
}
