package bancocuscatlan.core.bancocuscatlan.adapter.web;


import bancocuscatlan.core.bancocuscatlan.application.payment.in.PaymentPort;
import bancocuscatlan.core.bancocuscatlan.application.payment.in.PaymentRequest;
import bancocuscatlan.core.bancocuscatlan.common.CreateResponse;
import bancocuscatlan.core.bancocuscatlan.common.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentPort paymentPort;

    @PostMapping
    public ResponseEntity<ResponseDTO> payment(@RequestBody PaymentRequest paymentRequest){
        return CreateResponse.response(paymentPort.payment(paymentRequest));
    }
}
