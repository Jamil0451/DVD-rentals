package info.cognit.dvdrental.domain.repository;

import info.cognit.dvdrental.domain.entity.InventoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface InventoryRepo extends CrudRepository<InventoryEntity, Long> {
}
