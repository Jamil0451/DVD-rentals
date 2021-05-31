package info.cognit.conway.service.impl;

import info.cognit.conway.domain.entity.ProductEntity;

import java.util.List;

public interface ProductService {

    List<ProductEntity> getAllProducts();

    ProductEntity getProductById(long productId);

    List<ProductEntity> getAllProductByNameAndUnitPrice(String productName, Double unitPrice);
    }
