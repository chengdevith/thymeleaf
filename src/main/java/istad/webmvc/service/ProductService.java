package istad.webmvc.service;

import istad.webmvc.dto.response.ProductResponse;
import istad.webmvc.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<ProductResponse> findAll();
    List<ProductResponse> findByName(String name,Boolean status);
    ProductResponse addProduct(Product product);

}
