package info.cognit.conway.controller;

import info.cognit.conway.domain.entity.ProductEntity;
import info.cognit.conway.domain.repository.ProductRepo;
import info.cognit.conway.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    ProductRepo productRepo;

    @GetMapping("/all") //localhost:8080/product/all
    public List<ProductEntity> getAll() {
        return productService.getAllProducts();
    }

    @GetMapping(value = "/all", params = {"productName", "unitPrice"})
    public List<ProductEntity> getAllProductByNameAndUnitPrice(@RequestParam("productName") String productName, @RequestParam("unitPrice") Double UnitPrice){
        return productService.getAllProductByNameAndUnitPrice(productName, unitPrice);
    }

    @GetMapping(value = "all", params = {"productId"})
    public ProductEntity getOneProductByproductId(@RequestParam("productId") long productId) {
        return productService.getProductById(productId);
    }
}

