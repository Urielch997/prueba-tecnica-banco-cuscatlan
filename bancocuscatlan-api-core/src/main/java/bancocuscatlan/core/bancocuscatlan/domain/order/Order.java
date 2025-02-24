package bancocuscatlan.core.bancocuscatlan.domain.order;

import bancocuscatlan.core.bancocuscatlan.domain.client.Client;
import bancocuscatlan.core.bancocuscatlan.domain.orderDetail.OrderDetail;

import java.math.BigDecimal;


public class Order {
    private Long id;

    private String orderNumber;

    private OrderDetail orderDetail;

    private String paymentReferenceNumber;

    private BigDecimal total;

    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderDetail getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetail orderDetail) {
        this.orderDetail = orderDetail;
    }

    public String getPaymentReferenceNumber() {
        return paymentReferenceNumber;
    }

    public void setPaymentReferenceNumber(String paymentReferenceNumber) {
        this.paymentReferenceNumber = paymentReferenceNumber;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    private Order(OrderBuilder orderBuilder){
        this.id = orderBuilder.id;
        this.orderNumber = orderBuilder.orderNumber;
        this.orderDetail = orderBuilder.orderDetail;
        this.paymentReferenceNumber = orderBuilder.paymentReferenceNumber;
        this.total = orderBuilder.total;
        this.client = orderBuilder.client;
    }

    public static class OrderBuilder{
        private Long id;
        private String orderNumber;
        private OrderDetail orderDetail;
        private String paymentReferenceNumber;
        private BigDecimal total;
        private Client client;

        public OrderBuilder id(Long id){
            this.id = id;
            return this;
        }

        public OrderBuilder orderNumber(String orderNumber){
            this.orderNumber = orderNumber;
            return this;
        }

        public OrderBuilder orderDetail(OrderDetail orderDetail){
            this.orderDetail = orderDetail;
            return this;
        }

        public OrderBuilder paymentReferenceNumber(String paymentReferenceNumber){
            this.paymentReferenceNumber = paymentReferenceNumber;
            return this;
        }

        public OrderBuilder total(BigDecimal total){
            this.total = total;
            return this;
        }

        public OrderBuilder client(Client client){
            this.client = client;
            return this;
        }

        public Order build(){
            return new Order(this);
        }

    }

    public static OrderBuilder builder(){
        return new OrderBuilder();
    }
}
