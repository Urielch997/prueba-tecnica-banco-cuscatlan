package bancocuscatlan.products.bancocuscatlan.application.service;

import bancocuscatlan.products.bancocuscatlan.adapter.externalApi.ProductsClient;
import bancocuscatlan.products.bancocuscatlan.application.port.ProductsService;
import bancocuscatlan.products.bancocuscatlan.domain.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProducstServiceImpl implements ProductsService {

    @Autowired
    ProductsClient productsClient;

    @Override
    public List<Products> findAllProducts() {
        return productsClient.findAllProducts();
    }

    @Override
    public Products findByProductId(Long id) {
        return productsClient.findByProductId(id);
    }
}
