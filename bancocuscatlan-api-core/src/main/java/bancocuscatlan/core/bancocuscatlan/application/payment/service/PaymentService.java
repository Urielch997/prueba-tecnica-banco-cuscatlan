package bancocuscatlan.core.bancocuscatlan.application.payment.service;

import bancocuscatlan.core.bancocuscatlan.adapter.persistence.exception.PaymentException;
import bancocuscatlan.core.bancocuscatlan.application.generateOrder.out.LoadOrder;
import bancocuscatlan.core.bancocuscatlan.application.generateOrder.out.SaveOrder;
import bancocuscatlan.core.bancocuscatlan.application.payment.in.PaymentPort;
import bancocuscatlan.core.bancocuscatlan.application.payment.in.PaymentRequest;
import bancocuscatlan.core.bancocuscatlan.domain.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentService implements PaymentPort {

    @Autowired
    SaveOrder saveOrder;
    @Autowired
    LoadOrder loadOrder;


    @Override
    public String payment(PaymentRequest paymentRequest) {
        String status = Math.random() > 0.5 ? "APPROVED" : "DECLINED";

        if(status.contentEquals("DECLINED")) throw new PaymentException("Error to process payment");

        Order order = loadOrder.load(paymentRequest.getIdOrder());
        order.setPaymentReferenceNumber(UUID.randomUUID().toString());


        return "Payment process success";
    }
}
