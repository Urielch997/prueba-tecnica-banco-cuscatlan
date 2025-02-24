package bancocuscatlan.core.bancocuscatlan.adapter.externalApi;

import bancocuscatlan.core.bancocuscatlan.application.generateOrder.out.LoadProduct;
import bancocuscatlan.core.bancocuscatlan.domain.products.Products;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductPersistenceAdapter implements LoadProduct {

    @Autowired
    ProductsFeign productsFeign;

    @Autowired
    ObjectMapper mapper;

    @Override
    public Products loadProduct(Long id) {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        return mapper.convertValue(productsFeign.findProductsById(id).getBody().getResult(), Products.class);
    }
}
