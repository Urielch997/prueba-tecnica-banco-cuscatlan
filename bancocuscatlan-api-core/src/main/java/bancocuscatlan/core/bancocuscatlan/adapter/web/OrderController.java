package bancocuscatlan.core.bancocuscatlan.adapter.web;


import bancocuscatlan.core.bancocuscatlan.application.generateOrder.in.GenerateOrder;
import bancocuscatlan.core.bancocuscatlan.application.generateOrder.in.GenerateOrderPort;
import bancocuscatlan.core.bancocuscatlan.common.CreateResponse;
import bancocuscatlan.core.bancocuscatlan.common.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    GenerateOrderPort generateOrderPort;

    @PostMapping
    public ResponseEntity<ResponseDTO> createOrder(@RequestBody GenerateOrder order){
        return CreateResponse.response(generateOrderPort.generateOrder(order));
    }
}
