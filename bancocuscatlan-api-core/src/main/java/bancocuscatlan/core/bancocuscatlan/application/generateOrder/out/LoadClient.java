package bancocuscatlan.core.bancocuscatlan.application.generateOrder.out;

import bancocuscatlan.core.bancocuscatlan.domain.client.Client;

public interface LoadClient {
    Client load(Long id);
}
