package fr.formation.financings.services;

import fr.formation.financings.entities.Financing;

public interface FinancingService {

    void create(Financing financing);

    void delete(Long id);

    Financing getOne(Long id);
}
