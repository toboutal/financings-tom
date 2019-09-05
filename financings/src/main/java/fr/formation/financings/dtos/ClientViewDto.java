package fr.formation.financings.dtos;

import fr.formation.financings.entities.LegalForm;

public interface ClientViewDto {

    LegalForm getLegalForm();

    String getName();

    Long getContactId();
}
