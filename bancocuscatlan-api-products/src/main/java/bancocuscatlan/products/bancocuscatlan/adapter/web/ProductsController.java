package bancocuscatlan.products.bancocuscatlan.adapter.web;

import bancocuscatlan.products.bancocuscatlan.application.port.ProductsService;
import bancocuscatlan.products.bancocuscatlan.common.CreateResponse;
import bancocuscatlan.products.bancocuscatlan.common.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    ProductsService productsService;

    @GetMapping
    private ResponseEntity<ResponseDTO> findAllProducts(){
        return CreateResponse.response(productsService.findAllProducts());
    }

    @GetMapping("/{id}")
    private ResponseEntity<ResponseDTO> findByProductId(@PathVariable Long id){
        return CreateResponse.response(productsService.findByProductId(id));
    }

}
