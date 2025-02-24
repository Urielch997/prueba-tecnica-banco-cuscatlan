package bancocuscatlan.core.bancocuscatlan.application.payment.out;

import bancocuscatlan.core.bancocuscatlan.domain.order.Order;

public interface UpdateOrder {
    Order update(Order ordder);
}
