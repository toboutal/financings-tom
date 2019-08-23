package fr.formation.financings.services;

import org.springframework.stereotype.Service;

import fr.formation.financings.entities.Financing;
import fr.formation.financings.repositories.FinancingRepository;

@Service
public class FinancingServiceImpl implements FinancingService {

    private final FinancingRepository repo;

    protected FinancingServiceImpl(FinancingRepository repo) {
	this.repo = repo;
    }

    @Override
    public void create(Financing financing) {
	repo.save(financing);
    }

    @Override
    public void delete(Long id) {
	repo.deleteById(id);
    }

    @Override
    public Financing getOne(Long id) {
	return repo.findById(id).get();
    }
}
