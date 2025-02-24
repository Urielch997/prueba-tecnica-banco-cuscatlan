package bancocuscatlan.core.bancocuscatlan.application.generateOrder.in;

import java.util.List;

public class GenerateOrder {
    private Long idClient;
    private List<DetailOrder> detailOrder;

    public List<DetailOrder> getDetailOrder() {
        return detailOrder;
    }

    public void setDetailOrder(List<DetailOrder> detailOrder) {
        this.detailOrder = detailOrder;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GenerateOrder{");
        sb.append("idClient=").append(idClient);
        sb.append(", detailOrder=").append(detailOrder);
        sb.append('}');
        return sb.toString();
    }
}
