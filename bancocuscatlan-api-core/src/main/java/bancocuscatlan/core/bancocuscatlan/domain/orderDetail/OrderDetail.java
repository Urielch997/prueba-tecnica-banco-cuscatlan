package bancocuscatlan.core.bancocuscatlan.domain.orderDetail;

import bancocuscatlan.core.bancocuscatlan.adapter.persistence.client.ClientEntity;
import bancocuscatlan.core.bancocuscatlan.domain.order.Order;

public class OrderDetail {
    private Long id;

    private Integer cantidad;

    private Long productId;

    private Order order;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    private OrderDetail(OrderDetailBuilder orderDetailBuilder){
        this.cantidad = orderDetailBuilder.cantidad;
        this.id = orderDetailBuilder.id;
        this.productId = orderDetailBuilder.productId;
        this.order = orderDetailBuilder.order;
    }

    public static class OrderDetailBuilder{
        private Long id;
        private Integer cantidad;
        private Long productId;
        private Order order;

        public OrderDetailBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public OrderDetailBuilder cantidad(Integer cantidad) {
            this.cantidad = cantidad;
            return this;
        }

        public OrderDetailBuilder productId(Long productId) {
            this.productId = productId;
            return this;
        }

        public OrderDetailBuilder order(Order order) {
            this.order = order;
            return this;
        }


        public OrderDetail build(){
            return new OrderDetail(this);
        }
    }

    public static OrderDetailBuilder builder(){
        return new OrderDetailBuilder();
    }
}
