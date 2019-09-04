package fr.formation.financings.services;

import javax.validation.Valid;

import fr.formation.financings.dtos.ClientDto;
import fr.formation.financings.entities.Client;

public interface ClientService {

    void create(ClientDto dto);

    void delete(Long id);

    Client getOne(Long id);

    void update(Long id);

    void update(@Valid ClientDto dto, Long id);
}
