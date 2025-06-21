package istad.webmvc.controller;

import istad.webmvc.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    private final List<Product> products;

    public ProductController(List<Product> products) {
        this.products = products;
    }

    // Mapping URL
    // TODO: View product list
    @GetMapping
    String product(Model model) {
        model.addAttribute("products", products);
        return "product/product";
    }

    @GetMapping("/{productid}/detail")
    String productDetail(@PathVariable Integer productid, Model model) {

        Product product = products.stream().filter(p -> p.getId().equals(productid)).findFirst().orElse(null);

        model.addAttribute("product", product);
        return "product/product-detail";
    }

}
