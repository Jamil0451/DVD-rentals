package info.cognit.dvdrental.domain.repository;

import info.cognit.dvdrental.domain.entity.PaymentEntity;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepo extends CrudRepository <PaymentEntity, Long> {
}
