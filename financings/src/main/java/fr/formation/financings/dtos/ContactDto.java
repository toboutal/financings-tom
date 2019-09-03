package fr.formation.financings.dtos;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import fr.formation.financings.entities.ContactInfo;

public class ContactDto {

    @NotEmpty
    @Size(max = 255)
    private String firstName;

    @NotEmpty
    @Size(max = 255)
    private String lastName;

    @NotNull
    private Long contactId;

    @NotNull
    @Size(max = 20)
    private String phone;

    public ContactDto() {
	//
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public Long getContactId() {
	return contactId;
    }

    public void setContactId(Long contactId) {
	this.contactId = contactId;
    }

    public ContactInfo getInfo() {
	return info;
    }

    public void setInfo(ContactInfo info) {
	this.info = info;
    }
}
