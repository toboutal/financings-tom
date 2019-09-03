package fr.formation.financings.services;

import fr.formation.financings.dtos.ContactDto;
import fr.formation.financings.entities.Contact;

public interface ContactService {

    void create(ContactDto dto);

    void delete(Long id);

    Contact getOne(Long id);
}
