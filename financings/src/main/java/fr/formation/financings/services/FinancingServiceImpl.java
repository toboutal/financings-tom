package fr.formation.financings.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import fr.formation.financings.dtos.FinancingDto;
import fr.formation.financings.dtos.FinancingViewDto;
import fr.formation.financings.entities.Financing;
import fr.formation.financings.repositories.ClientRepository;
import fr.formation.financings.repositories.FinancingRepository;

@Service
public class FinancingServiceImpl implements FinancingService {

    private final FinancingRepository financingRepo;

    private final ClientRepository clientRepo;

    private final ModelMapper mapper;

    protected FinancingServiceImpl(FinancingRepository financingRepo,
	    ClientRepository clientRepo, ModelMapper mapper) {
	this.financingRepo = financingRepo;
	this.clientRepo = clientRepo;
	this.mapper = mapper;
    }

    @Override
    public void create(FinancingDto dto) {
	// Convert DTO to entities
	// Financing financing = new Financing();
	// populateAndSave(dto, financing);
	Financing entity = mapper.map(dto, Financing.class);
	financingRepo.save(entity);
    }

    @Override
    public void update(FinancingDto dto, Long id) {
	// Convert dto to entity:
	Financing financing = financingRepo.findById(id).get();
	populateAndSave(dto, financing);
    }

    private void populateAndSave(FinancingDto dto, Financing financing) {
	// trandform DTO into Entity
	Financing entity = mapper.map(dto, Financing.class);
	financingRepo.save(entity);
	// Remplacer par le mapping
	/*
	 * financing.setName(dto.getName());
	 * financing.setAmount(dto.getAmount());
	 * financing.setReference(dto.getReference());
	 * financing.setRate(dto.getRate());
	 * financing.setStartDate(dto.getStartDate());
	 * financing.setEndDate(dto.getEndDate());
	 * financing.setValidated(dto.getValidated()); // Financing needs a
	 * Client object, not an id: Client client =
	 * clientRepo.getOne(dto.getClientId()); financing.setClient(client);
	 */
    }

    @Override
    public void delete(Long id) {
	financingRepo.deleteById(id);
    }

    @Override
    public FinancingViewDto getOne(Long id) {
	return financingRepo.getById(id);
    }

    @Override
    public List<FinancingViewDto> getAll() {
	return financingRepo.getAllProjectedBy();
    }

    @Override
    public void validate(Long id) {
	Financing target = financingRepo.findById(id).get();
	target.setValidated(true);
	financingRepo.save(target);
    }
}
