package fr.formation.financings.services;

import java.util.List;

import javax.validation.Valid;

import fr.formation.financings.dtos.ClientDto;
import fr.formation.financings.dtos.ClientViewDto;

public interface ClientService {

    void create(ClientDto dto);

    void delete(Long id);

    ClientViewDto getOne(Long id);

    void update(@Valid ClientDto dto, Long id);

    List<ClientViewDto> getAll();
}
