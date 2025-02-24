package bancocuscatlan.core.bancocuscatlan.adapter.persistence.orderDetail;


import bancocuscatlan.core.bancocuscatlan.application.generateOrder.out.SaveAllOrderDetail;
import bancocuscatlan.core.bancocuscatlan.application.generateOrder.out.SaveDetailOrder;
import bancocuscatlan.core.bancocuscatlan.domain.orderDetail.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailPersistenceAdapter implements SaveDetailOrder, SaveAllOrderDetail {

    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Override
    public OrderDetail saveDetail(OrderDetail orderDetail) {
        return OrderDetailMapper.orderDetailEntityToDomain(orderDetailRepository.save(OrderDetailMapper.domainToOrderDetailEntity(orderDetail)));
    }

    @Override
    public List<OrderDetail> saveAllDetail(List<OrderDetail> orderDetails) {
        return orderDetailRepository.saveAll(orderDetails.stream()
                        .map(orderDetail -> OrderDetailMapper.domainToOrderDetailEntity(orderDetail)).toList())
                .stream().
                map(orderDetailEntity -> OrderDetailMapper.orderDetailEntityToDomain(orderDetailEntity)).toList();
    }
}
