package fr.formation.financings.dtos;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import fr.formation.financings.entities.LegalForm;

public class ClientDto {

    private LegalForm legalForm;

    @NotEmpty
    @Size(max = 255)
    private String name;

    private Long contactId;

    public ClientDto() {
    }

    public LegalForm getLegalForm() {
	return legalForm;
    }

    public void setLegalForm(LegalForm legalForm) {
	this.legalForm = legalForm;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Long getContactId() {
	return contactId;
    }

    public void setContactId(Long contactId) {
	this.contactId = contactId;
    }
}
