package fr.formation.financings.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.financings.dtos.ContactViewDto;
import fr.formation.financings.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    ContactViewDto getById(Long id);

    List<ContactViewDto> getAllProjectedBy();
}
