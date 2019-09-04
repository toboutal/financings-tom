package fr.formation.financings.services;

import fr.formation.financings.dtos.ClientDto;
import fr.formation.financings.entities.Client;
import fr.formation.financings.entities.Contact;
import fr.formation.financings.repositories.ClientRepository;
import fr.formation.financings.repositories.ContactRepository;

public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepo;

    private final ContactRepository contactRepo;

    protected ClientServiceImpl(ClientRepository clientRepo,
	    ContactRepository contactRepo) {
	this.clientRepo = clientRepo;
	this.contactRepo = contactRepo;
    }

    @Override
    public void create(ClientDto dto) {
	// TODO Auto-generated method stub
	Client client = new Client();
	client.setLegalForm(dto.getLegalForm());
	client.setName(dto.getName());
	Contact contact = contactRepo.getOne(dto.getContactId());
	client.setContact(contact);
	clientRepo.save(client);
    }

    @Override
    public void delete(Long id) {
	// TODO Auto-generated method stub
	clientRepo.deleteById(id);
    }

    @Override
    public Client getOne(Long id) {
	// TODO Auto-generated method stub
	return clientRepo.findById(id).get();
    }

    @Override
    public void update(ClientDto dto, Long id) {
	Client client = clientRepo.findById(id).get();
	client.setLegalForm(dto.getLegalForm());
	client.setName(dto.getName());
	Contact contact = contactRepo.getOne(dto.getContactId());
	client.setContact(contact);
	clientRepo.save(client);
    }

    @Override
    public void update(Long id) {
	// TODO Auto-generated method stub
    }
}
