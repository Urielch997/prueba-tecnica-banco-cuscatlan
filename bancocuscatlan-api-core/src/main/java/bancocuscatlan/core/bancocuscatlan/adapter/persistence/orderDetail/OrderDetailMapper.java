package bancocuscatlan.core.bancocuscatlan.adapter.persistence.orderDetail;

import bancocuscatlan.core.bancocuscatlan.adapter.persistence.order.OrderEntity;
import bancocuscatlan.core.bancocuscatlan.adapter.persistence.order.OrderMapper;
import bancocuscatlan.core.bancocuscatlan.domain.orderDetail.OrderDetail;

public class OrderDetailMapper {

    public static OrderDetail orderDetailEntityToDomain(OrderDetailEntity orderDetailEntity){
        return OrderDetail.builder()
                .id(orderDetailEntity.getId())
                .cantidad(orderDetailEntity.getCantidad())
                .productId(orderDetailEntity.getProductId())
                .build();
    }

    public static OrderDetailEntity domainToOrderDetailEntity(OrderDetail orderDetail){

        OrderEntity orderEntity = OrderMapper.DomainToOrderEntity(orderDetail.getOrder());

        return OrderDetailEntity.builder()
                .id(orderDetail.getId())
                .cantidad(orderDetail.getCantidad())
                .order(orderEntity)
                .productId(orderDetail.getProductId())
                .build();
    }
}
