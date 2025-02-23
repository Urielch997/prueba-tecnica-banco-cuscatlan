package bancocuscatlan.products.bancocuscatlan.application.productsFeign;

import bancocuscatlan.products.bancocuscatlan.domain.Products;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "${products.fakestoreapi.url}",name = "${products.fakestoreapi.name}")
public interface ProductsClient {

    @GetMapping("/products/{id}")
    Products findByProductId(@PathVariable Long id);

    @GetMapping("/products")
    List<Products> findAllProducts();
}
