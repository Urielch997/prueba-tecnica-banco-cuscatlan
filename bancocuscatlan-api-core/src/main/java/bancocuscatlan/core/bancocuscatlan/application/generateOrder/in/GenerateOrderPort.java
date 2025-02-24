package bancocuscatlan.core.bancocuscatlan.application.generateOrder.in;

import bancocuscatlan.core.bancocuscatlan.application.generateOrder.out.GenerateOrderResponse;

public interface GenerateOrderPort {
    GenerateOrderResponse generateOrder(GenerateOrder order);
}
