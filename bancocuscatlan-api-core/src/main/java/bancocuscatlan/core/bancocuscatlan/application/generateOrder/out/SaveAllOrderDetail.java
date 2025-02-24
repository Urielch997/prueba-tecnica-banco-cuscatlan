package bancocuscatlan.core.bancocuscatlan.application.generateOrder.out;

import bancocuscatlan.core.bancocuscatlan.domain.orderDetail.OrderDetail;

import java.util.List;

public interface SaveAllOrderDetail {
    List<OrderDetail> saveAllDetail(List<OrderDetail> orderDetails);
}
