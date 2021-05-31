package info.cognit.conway.service.impl;
import info.cognit.conway.domain.entity.ProductEntity;
import info.cognit.conway.domain.repository.ProductRepo;
import info.cognit.conway.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<ProductEntity> getAllProducts() {
        List<ProductEntity> products = new ArrayList<>();
        Iterable<ProductEntity> all = productRepo.findAll();
        all.forEach(productEntity -> products.add(productEntity));
        return products;
    }

    @Override
    public ProductEntity getProductById(long id) {
        Optional<ProductEntity> byId = productRepo.findById(id);
        if (byId.isPresent()) {
            return byId.get();
        }
        return null;
    }

    @Override
    public List<ProductEntity> getAllProductByNameAndUnitPrice(String productName, Double unitPrice){
        return productRepo.findAllByproductNameAndUnitPrice(productName, unitPrice) ;
    }
}


// Service layer is for processing business logic