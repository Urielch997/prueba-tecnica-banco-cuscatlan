package bancocuscatlan.core.bancocuscatlan.adapter.persistence.client;

import bancocuscatlan.core.bancocuscatlan.adapter.persistence.exception.NotFoundException;
import bancocuscatlan.core.bancocuscatlan.application.generateOrder.out.LoadClient;
import bancocuscatlan.core.bancocuscatlan.domain.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientPersistenceAdapter implements LoadClient {
    @Autowired
    ClientRepository clientRepository;


    @Override
    public Client load(Long id) {
        return clientRepository.findById(id)
                .map(ClientMapper::clientEntityToDomain)
                .orElseThrow(()-> new NotFoundException("User not found"));
    }
}
