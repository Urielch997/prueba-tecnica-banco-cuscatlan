package bancocuscatlan.core.bancocuscatlan.adapter.persistence.order;


import bancocuscatlan.core.bancocuscatlan.adapter.persistence.exception.NotFoundException;
import bancocuscatlan.core.bancocuscatlan.application.generateOrder.out.LoadOrder;
import bancocuscatlan.core.bancocuscatlan.application.generateOrder.out.SaveOrder;
import bancocuscatlan.core.bancocuscatlan.application.payment.out.UpdateOrder;
import bancocuscatlan.core.bancocuscatlan.domain.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderPersistenceAdapter implements SaveOrder, UpdateOrder, LoadOrder {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order save(Order order) {
        return OrderMapper.OrderEntityToDomain(orderRepository.save(OrderMapper.DomainToOrderEntity(order)));
    }

    @Override
    public Order update(Order order) {
        return OrderMapper.OrderEntityToDomain(orderRepository.save(OrderMapper.DomainToOrderEntity(order)));
    }

    @Override
    public Order load(Long id) {
        return OrderMapper.OrderEntityToDomain(orderRepository.findById(id).orElseThrow(()->new NotFoundException("Order not found: " + id)));
    }
}
