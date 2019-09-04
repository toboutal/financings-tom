package fr.formation.financings.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Embeddable // Embarquable
public class ContactInfo {

    @NotBlank
    @Size(max = 255)
    @Column(length = 255, nullable = false)
    private String email;

    @NotBlank
    @Size(max = 20)
    @Column(length = 20, nullable = false)
    private String phone;

    @NotBlank
    @Size(max = 20)
    @Column(length = 20, nullable = false)
    private String mobile;

    public ContactInfo() {
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getPhone() {
	return phone;
    }

    public void setPhone(String phone) {
	this.phone = phone;
    }

    public String getMobile() {
	return mobile;
    }

    public void setMobile(String mobile) {
	this.mobile = mobile;
    }
}