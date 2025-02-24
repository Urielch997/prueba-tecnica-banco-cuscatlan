package bancocuscatlan.core.bancocuscatlan.application.generateOrder.out;

import bancocuscatlan.core.bancocuscatlan.domain.order.Order;

public interface SaveOrder {
    Order save(Order order);
}
