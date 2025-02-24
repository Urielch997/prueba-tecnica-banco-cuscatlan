package bancocuscatlan.core.bancocuscatlan.adapter.externalApi;

import bancocuscatlan.core.bancocuscatlan.common.ResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${api.products.name}",url = "${api.products.url}")
public interface ProductsFeign {

    @GetMapping("/api-products/products/{id}")
    ResponseEntity<ResponseDTO> findProductsById(@PathVariable Long id);
}
