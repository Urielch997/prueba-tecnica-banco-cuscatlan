package bancocuscatlan.core.bancocuscatlan;

import bancocuscatlan.core.bancocuscatlan.adapter.persistence.client.ClientEntity;
import bancocuscatlan.core.bancocuscatlan.adapter.persistence.client.ClientRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class InitData implements InitializingBean {

    private final ClientRepository clientRepository;

    public InitData(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        ClientEntity clientEntity = new ClientEntity();

        clientEntity.setName("Brayan");
        clientEntity.setLastName("Hernandez");
        this.clientRepository.save(clientEntity);

        ClientEntity clientEntity2 = new ClientEntity();
        clientEntity2.setName("Juan");
        clientEntity2.setLastName("Perez");
        this.clientRepository.save(clientEntity2);
    }
}
