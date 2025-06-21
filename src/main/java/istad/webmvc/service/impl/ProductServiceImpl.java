package istad.webmvc.service.impl;

import istad.webmvc.dto.response.ProductResponse;
import istad.webmvc.model.Product;
import istad.webmvc.repository.ProductRepository;
import istad.webmvc.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    final ProductRepository productRepository;

    @Override
    public List<ProductResponse> findAll() {
        return productRepository.select().stream().map(p -> ProductResponse.builder().code(p.getCode()).name(p.getName()).price(p.getPrice()).build()).collect(Collectors.toList());
    }

    @Override
    public List<ProductResponse> findByName(String name, Boolean status) {
        return List.of();
    }

    @Override
    public ProductResponse addProduct(Product product) {
        return null;
    }
}
