package bancocuscatlan.core.bancocuscatlan.adapter.persistence.order;

import bancocuscatlan.core.bancocuscatlan.adapter.persistence.client.ClientEntity;
import bancocuscatlan.core.bancocuscatlan.adapter.persistence.client.ClientMapper;
import bancocuscatlan.core.bancocuscatlan.domain.client.Client;
import bancocuscatlan.core.bancocuscatlan.domain.order.Order;

public class OrderMapper {

    public static Order OrderEntityToDomain(OrderEntity orderEntity){
        Client client = ClientMapper.clientEntityToDomain(orderEntity.getClientEntity());
        return Order.builder()
                .id(orderEntity.getId())
                .orderNumber(orderEntity.getOrderNumber())
                .client(client)
                .paymentReferenceNumber(orderEntity.getPaymentReferenceNumber())
                .build();
    }

    public static OrderEntity DomainToOrderEntity(Order order){
        ClientEntity clientEntity = ClientEntity.builder().id(order.getClient().getId()).build();
        return OrderEntity.builder()
                .id(order.getId())
                .orderNumber(order.getOrderNumber())
                .clientEntity(clientEntity)
                .total(order.getTotal())
                .paymentReferenceNumber(order.getPaymentReferenceNumber())
                .build();
    }
}
