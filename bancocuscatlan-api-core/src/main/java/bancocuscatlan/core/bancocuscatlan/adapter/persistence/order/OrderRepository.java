package bancocuscatlan.core.bancocuscatlan.adapter.persistence.order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity,Long> {
}
