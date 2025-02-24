package bancocuscatlan.core.bancocuscatlan.application.generateOrder.service;

import bancocuscatlan.core.bancocuscatlan.application.generateOrder.in.DetailOrder;
import bancocuscatlan.core.bancocuscatlan.application.generateOrder.in.GenerateOrder;
import bancocuscatlan.core.bancocuscatlan.application.generateOrder.in.GenerateOrderPort;
import bancocuscatlan.core.bancocuscatlan.application.generateOrder.out.*;
import bancocuscatlan.core.bancocuscatlan.domain.client.Client;
import bancocuscatlan.core.bancocuscatlan.domain.order.Order;
import bancocuscatlan.core.bancocuscatlan.domain.orderDetail.OrderDetail;
import bancocuscatlan.core.bancocuscatlan.domain.products.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class GenerateOrderService implements GenerateOrderPort {

    @Autowired
    LoadClient loadClient;

    @Autowired
    SaveDetailOrder saveDetailOrder;

    @Autowired
    SaveAllOrderDetail saveAllOrderDetail;

    @Autowired
    SaveOrder saveOrder;

    @Autowired
    LoadProduct loadProduct;

    @Override
    public GenerateOrderResponse generateOrder(GenerateOrder order) {
        Client client = loadClient.load(order.getIdClient());

        List<Products> products = order.getDetailOrder().stream().map(item -> {
          Products products1 = loadProduct.loadProduct(item.getIdProducto());
          products1.setCantidad(item.getCantidad());
          return products1;
        }).toList();

        BigDecimal totalCompra = products.stream().map(products1 -> products1.getPrice().multiply(BigDecimal.valueOf(products1.getCantidad()))).reduce(BigDecimal.ZERO, BigDecimal::add);

        Client client1 = Client.builder().id(order.getIdClient()).build();

        Order order1 = Order.builder().orderNumber(UUID.randomUUID().toString()).total(totalCompra).client(client1).build();

        order1 = saveOrder.save(order1);

        List<OrderDetail> orderDetails = new ArrayList<>();
        for(DetailOrder orderDetail : order.getDetailOrder()){
            OrderDetail orderDetail1 = OrderDetail.builder().cantidad(orderDetail.getCantidad()).productId(orderDetail.getIdProducto()).order(order1).build();
            orderDetails.add(orderDetail1);
        }

        saveAllOrderDetail.saveAllDetail(orderDetails);



        return GenerateOrderResponse.builder().idOrder(order1.getId()).orderNumber(order1.getOrderNumber()).total(totalCompra).build();
    }
}
