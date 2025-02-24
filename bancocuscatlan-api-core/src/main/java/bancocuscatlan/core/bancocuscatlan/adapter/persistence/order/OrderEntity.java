package bancocuscatlan.core.bancocuscatlan.adapter.persistence.order;

import bancocuscatlan.core.bancocuscatlan.adapter.persistence.client.ClientEntity;
import bancocuscatlan.core.bancocuscatlan.adapter.persistence.orderDetail.OrderDetailEntity;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "orders")
public class OrderEntity {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id_order")
    private Long id;


    private String orderNumber;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "order")
    private List<OrderDetailEntity> orderDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_client",referencedColumnName = "id_client")
    private ClientEntity clientEntity;

    private String paymentReferenceNumber;

    private BigDecimal total;

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

    public List<OrderDetailEntity> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<OrderDetailEntity> orderDetail) {
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

    public ClientEntity getClientEntity() {
        return clientEntity;
    }

    public void setClientEntity(ClientEntity clientEntity) {
        this.clientEntity = clientEntity;
    }

    public OrderEntity() {
    }

    public OrderEntity(Long id, List<OrderDetailEntity> orderDetail, String orderNumber, ClientEntity clientEntity, String paymentReferenceNumber, BigDecimal total) {
        this.id = id;
        this.orderDetail = orderDetail;
        this.orderNumber = orderNumber;
        this.clientEntity = clientEntity;
        this.paymentReferenceNumber = paymentReferenceNumber;
        this.total = total;
    }

    private OrderEntity(OrderEntityBuilder orderEntityBuilder){
        this.id = orderEntityBuilder.id;
        this.orderNumber = orderEntityBuilder.orderNumber;
        this.orderDetail = orderEntityBuilder.orderDetail;
        this.paymentReferenceNumber = orderEntityBuilder.paymentReferenceNumber;
        this.total = orderEntityBuilder.total;
        this.clientEntity = orderEntityBuilder.clientEntity;

    }

    public static class OrderEntityBuilder{
        private Long id;
        private String orderNumber;
        private List<OrderDetailEntity> orderDetail;
        private String paymentReferenceNumber;
        private BigDecimal total;
        private ClientEntity clientEntity;

        public OrderEntityBuilder id(Long id){
            this.id = id;
            return this;
        }

        public OrderEntityBuilder orderNumber(String orderNumber){
            this.orderNumber = orderNumber;
            return this;
        }

        public OrderEntityBuilder orderDetail(List<OrderDetailEntity> orderDetail){
            this.orderDetail = orderDetail;
            return this;
        }

        public OrderEntityBuilder paymentReferenceNumber(String paymentReferenceNumber){
            this.paymentReferenceNumber = paymentReferenceNumber;
            return this;
        }
        public OrderEntityBuilder total(BigDecimal total){
            this.total = total;
            return this;
        }

        public OrderEntityBuilder clientEntity(ClientEntity clientEntity){
            this.clientEntity = clientEntity;
            return this;
        }

        public OrderEntity build(){
            return new OrderEntity(this);
        }

    }

    public static OrderEntityBuilder builder(){
        return new OrderEntityBuilder();
    }
}
