package bancocuscatlan.core.bancocuscatlan.application.generateOrder.out;

import java.math.BigDecimal;

public class GenerateOrderResponse {
    private BigDecimal total;
    private String orderNumber;
    private Long idOrder;

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    private GenerateOrderResponse(GenerateOrderResponseBuilder generateOrderResponseBuilder){
        this.idOrder = generateOrderResponseBuilder.idOrder;
        this.orderNumber = generateOrderResponseBuilder.orderNumber;
        this.total = generateOrderResponseBuilder.total;
    }

    public static class GenerateOrderResponseBuilder{
        private BigDecimal total;
        private String orderNumber;
        private Long idOrder;

        public GenerateOrderResponseBuilder total(BigDecimal total) {
            this.total = total;
            return this;
        }

        public GenerateOrderResponseBuilder orderNumber(String orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        public GenerateOrderResponseBuilder idOrder(Long idOrder) {
            this.idOrder = idOrder;
            return this;
        }

        public GenerateOrderResponse build(){
            return new GenerateOrderResponse(this);
        }
    }

    public static GenerateOrderResponseBuilder builder(){
        return new GenerateOrderResponseBuilder();
    }
}
