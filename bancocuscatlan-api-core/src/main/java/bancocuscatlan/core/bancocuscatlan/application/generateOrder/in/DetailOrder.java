package bancocuscatlan.core.bancocuscatlan.application.generateOrder.in;

import java.math.BigDecimal;

public class DetailOrder {
    private Long idProducto;
    private Integer cantidad;

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }


}
