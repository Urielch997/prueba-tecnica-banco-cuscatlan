package bancocuscatlan.core.bancocuscatlan.application.generateOrder.out;

import bancocuscatlan.core.bancocuscatlan.domain.products.Products;

public interface LoadProduct {
    Products loadProduct(Long id);
}
