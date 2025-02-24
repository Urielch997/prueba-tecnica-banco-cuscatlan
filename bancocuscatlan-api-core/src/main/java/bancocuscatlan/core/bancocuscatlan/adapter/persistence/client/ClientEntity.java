package bancocuscatlan.core.bancocuscatlan.adapter.persistence.client;

import bancocuscatlan.core.bancocuscatlan.adapter.persistence.order.OrderEntity;
import bancocuscatlan.core.bancocuscatlan.domain.order.Order;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "client")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private Long id;


    private String name;

    private String lastName;

    @OneToMany(mappedBy = "clientEntity")
    List<OrderEntity> orders;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<OrderEntity> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderEntity> orders) {
        this.orders = orders;
    }

    public ClientEntity(String name, String lastName, Long id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }

    public ClientEntity() {
    }

    private ClientEntity(ClientEntityBuilder clientEntityBuilder){
        this.id = clientEntityBuilder.id;
        this.name = clientEntityBuilder.name;
        this.lastName = clientEntityBuilder.lastName;
    }

    public static class ClientEntityBuilder{
        private Long id;
        private String name;
        private String lastName;
        List<Order> orders;

        public ClientEntityBuilder id(Long id){
            this.id = id;
            return this;
        }

        public ClientEntityBuilder name(String name){
            this.name = name;
            return this;
        }

        public ClientEntityBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public ClientEntityBuilder orders(List<Order> orders){
            this.orders = orders;
            return this;
        }

        public ClientEntity build(){
            return new ClientEntity(this);
        }

    }

    public static ClientEntityBuilder builder(){
        return new ClientEntityBuilder();
    }
}
