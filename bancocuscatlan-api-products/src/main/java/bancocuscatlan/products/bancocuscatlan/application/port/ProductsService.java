package bancocuscatlan.products.bancocuscatlan.application.port;

import bancocuscatlan.products.bancocuscatlan.domain.Products;

import java.util.List;

public interface ProductsService {
    List<Products> findAllProducts();

    Products findByProductId(Long id);
}
