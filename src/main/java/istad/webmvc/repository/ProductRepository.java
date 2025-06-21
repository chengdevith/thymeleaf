package istad.webmvc.repository;

import istad.webmvc.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class ProductRepository {

    private final List<Product> products;

    public List<Product> select(){
        return products;
    };
    public List<Product> search(String name,Boolean status){
        return products.stream().filter(p->p.getName().toLowerCase().contains(name.toLowerCase())&&p.getStatus().equals(status)).collect(Collectors.toList());
    }
    public void insert(Product product){
        products.add(product);
    }

}
