package bancocuscatlan.core.bancocuscatlan.domain.client;

import bancocuscatlan.core.bancocuscatlan.domain.order.Order;

import java.util.List;

public class Client {
    private Long id;

    private String name;

    private String lastName;

    private List<Order> orders;

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

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    private Client(ClientBuilder clientBuilder){
        this.id = clientBuilder.id;
        this.name = clientBuilder.name;
        this.lastName = clientBuilder.lastName;
        this.orders = clientBuilder.orders;
    }

    public static class ClientBuilder{
        private Long id;
        private String name;
        private String lastName;
        List<Order> orders;

        public ClientBuilder id(Long id){
            this.id = id;
            return this;
        }

        public ClientBuilder name(String name){
            this.name = name;
            return this;
        }

        public ClientBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public ClientBuilder orders(List<Order> orders){
            this.orders = orders;
            return this;
        }

        public Client build(){
            return new Client(this);
        }

    }

    public static ClientBuilder builder(){
        return new ClientBuilder();
    }


}
