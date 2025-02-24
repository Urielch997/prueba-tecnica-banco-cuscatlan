package bancocuscatlan.core.bancocuscatlan.adapter.persistence.client;

import bancocuscatlan.core.bancocuscatlan.domain.client.Client;

public class ClientMapper {

    public static Client clientEntityToDomain(ClientEntity clientEntity){
        return Client.builder()
                .id(clientEntity.getId())
                .name(clientEntity.getName())
                .lastName(clientEntity.getLastName())
                .build();
    }

    public static ClientEntity clientEntityToDomain(Client client){
        return ClientEntity.builder()
                .id(client.getId())
                .name(client.getName())
                .lastName(client.getLastName())
                .build();
    }
}
