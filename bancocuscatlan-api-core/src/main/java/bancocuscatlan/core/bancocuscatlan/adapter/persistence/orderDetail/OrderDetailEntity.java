package bancocuscatlan.core.bancocuscatlan.adapter.persistence.orderDetail;

import bancocuscatlan.core.bancocuscatlan.adapter.persistence.client.ClientEntity;
import bancocuscatlan.core.bancocuscatlan.adapter.persistence.order.OrderEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "order_detail")
public class OrderDetailEntity {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id_order_detail")
    private Long id;


    private Integer cantidad;

    private Long productId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order",referencedColumnName = "id_order")
    private OrderEntity order;

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


    public OrderEntity getOrder() {
        return order;
    }

    public void setOrder(OrderEntity order) {
        this.order = order;
    }

    private OrderDetailEntity(OrderDetailEntityBuilder OrderDetailEntityBuilder){
        this.cantidad = OrderDetailEntityBuilder.cantidad;
        this.id = OrderDetailEntityBuilder.id;
        this.productId = OrderDetailEntityBuilder.productId;
        this.order = OrderDetailEntityBuilder.order;
    }

    public static class OrderDetailEntityBuilder{
        private Long id;
        private Integer cantidad;
        private Long productId;
        private OrderEntity order;

        public OrderDetailEntityBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public OrderDetailEntityBuilder cantidad(Integer cantidad) {
            this.cantidad = cantidad;
            return this;
        }

        public OrderDetailEntityBuilder productId(Long productId) {
            this.productId = productId;
            return this;
        }


        public OrderDetailEntityBuilder order(OrderEntity order) {
            this.order = order;
            return this;
        }

        public OrderDetailEntity build(){
            return new OrderDetailEntity(this);
        }
    }

    public static OrderDetailEntityBuilder builder(){
        return new OrderDetailEntityBuilder();
    }
}
