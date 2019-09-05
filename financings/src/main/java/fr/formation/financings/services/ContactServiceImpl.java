package fr.formation.financings.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.formation.financings.dtos.ContactDto;
import fr.formation.financings.dtos.ContactViewDto;
import fr.formation.financings.entities.Contact;
import fr.formation.financings.entities.ContactInfo;
import fr.formation.financings.repositories.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepo;

    protected ContactServiceImpl(ContactRepository contactRepo) {
	this.contactRepo = contactRepo;
    }

    @Override
    public void create(ContactDto dto) {
	// TODO Auto-generated method stub
	Contact contact = new Contact();
	populateAndSave(dto, contact);
    }

    private void populateAndSave(ContactDto dto, Contact contact) {
	contact.setFirstName(dto.getFirstName());
	contact.setLastName(dto.getLastName());
	ContactInfo contactInfo = new ContactInfo();
	contactInfo.setEmail(dto.getEmail());
	contactInfo.setMobile(dto.getMobile());
	contactInfo.setPhone(dto.getPhone());
	contact.setInfo(contactInfo);
	contactRepo.save(contact);
    }

    @Override
    public void update(ContactDto dto, Long id) {
	Contact contact = contactRepo.findById(id).get();
	populateAndSave(dto, contact);
    }

    @Override
    public void delete(Long id) {
	// TODO Auto-generated method stub
	contactRepo.deleteById(id);
    }

    @Override
    public ContactViewDto getOne(Long id) {
	// TODO Auto-generated method stub
	return contactRepo.getById(id);
    }

    @Override
    public List<ContactViewDto> getAll() {
	// TODO Auto-generated method stub
	return contactRepo.getAllProjectedBy();
    }
}
