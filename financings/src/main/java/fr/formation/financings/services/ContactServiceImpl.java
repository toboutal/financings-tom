package fr.formation.financings.services;

import fr.formation.financings.dtos.ContactDto;
import fr.formation.financings.entities.Contact;
import fr.formation.financings.repositories.ContactRepository;

public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepo;

    protected ContactServiceImpl(ContactRepository contactRepo) {
	this.contactRepo = contactRepo;
    }

    @Override
    public void create(ContactDto dto) {
	// TODO Auto-generated method stub
	Contact contact = new Contact();
	contact.setFirstName(dto.getFirstName());
	contact.setLastName(dto.getLastName());
    }

    @Override
    public void delete(Long id) {
	// TODO Auto-generated method stub
    }

    @Override
    public Contact getOne(Long id) {
	// TODO Auto-generated method stub
	return null;
    }
}
