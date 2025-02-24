package bancocuscatlan.core.bancocuscatlan.application.payment.in;

import bancocuscatlan.core.bancocuscatlan.domain.order.Order;

public interface PaymentPort {
    String payment(PaymentRequest paymentRequest);
}
