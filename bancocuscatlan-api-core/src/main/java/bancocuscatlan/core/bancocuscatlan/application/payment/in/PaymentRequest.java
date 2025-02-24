package bancocuscatlan.core.bancocuscatlan.application.payment.in;

public class PaymentRequest {
    private String cardNumber;
    private Long idOrder;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }
}
