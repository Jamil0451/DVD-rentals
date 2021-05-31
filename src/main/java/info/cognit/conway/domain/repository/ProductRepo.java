package info.cognit.conway.domain.repository;

import info.cognit.conway.domain.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;



//CrudeRepository is a part of the Spring Data JPA framework: CrudeRepository
public interface ProductRepo extends CrudRepository<ProductEntity, Long> {
    List<ProductEntity> findAllByproductNameAndUnitPrice(String productName, Double unitPrice){
        return productRepo.findAllByproductNameAndUnitPrice(productName, unitPrice);
    }
}
