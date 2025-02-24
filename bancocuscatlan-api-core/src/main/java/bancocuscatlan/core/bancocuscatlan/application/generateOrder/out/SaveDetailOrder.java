package bancocuscatlan.core.bancocuscatlan.application.generateOrder.out;

import bancocuscatlan.core.bancocuscatlan.domain.orderDetail.OrderDetail;

public interface SaveDetailOrder {
    OrderDetail saveDetail(OrderDetail orderDetail);
}
