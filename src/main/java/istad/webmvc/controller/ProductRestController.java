package istad.webmvc.controller;

import istad.webmvc.dto.response.ProductResponse;
import istad.webmvc.model.Product;
import istad.webmvc.repository.ProductRepository;
import istad.webmvc.service.ProductService;
import istad.webmvc.service.impl.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductRestController {
    private final ProductServiceImpl productServiceImpl;

    @GetMapping
    public List<ProductResponse> searchProductsByName(@RequestParam(required = false, defaultValue = "") String name,
                                              @RequestParam(required = false , defaultValue = "true") Boolean status) {

        return productServiceImpl.findAll();
    }


}
