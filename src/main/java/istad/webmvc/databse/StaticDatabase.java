package istad.webmvc.databse;

import istad.webmvc.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class StaticDatabase {

    @Bean
    List<Product> dataProduct(){
        return new ArrayList<>(List.of(
                Product.builder().url("https://digitalcontent.api.tesco.com/v2/media/ghs/c60498a9-661c-4905-afda-3a0c538b969f/f49ef0f3-3c5f-4b31-8fe6-72642bfae943_472130746.jpeg?h=960&w=960").id(1).code("A001").name("Pepsi").description("tena new song").price(BigDecimal.valueOf(1)).status(true).build(),
                Product.builder().url("https://www.coca-cola.com/content/dam/onexp/us/en/brands/coca-cola-original/en_coca-cola-original-taste-20-oz_750x750_v1.jpg").id(2).code("A002").name("Coca").description("tena new song").price(BigDecimal.valueOf(1)).status(true).build(),
                Product.builder().url("https://libertycokedelivery.com/cdn/shop/products/Sprite-20oz-1_2048x.jpg?v=1737050264").id(3).code("A003").name("Sprite").description("tena new song").price(BigDecimal.valueOf(1)).status(true).build()
        ));
    }

}
