package info.cognit.dvdrental.domain.repository;

import info.cognit.dvdrental.domain.entity.AddressEntity;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<AddressEntity, Long> {

}
