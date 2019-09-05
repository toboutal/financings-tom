package fr.formation.financings.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.financings.dtos.ContactDto;
import fr.formation.financings.dtos.ContactViewDto;
import fr.formation.financings.services.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired // = @Inject
    private ContactService service;

    @PostMapping
    protected void create(@Valid @RequestBody ContactDto dto) {
	service.create(dto);
    }

    @PutMapping("/{id}")
    protected void update(@Valid @RequestBody ContactDto dto,
	    @PathVariable("id") Long id) {
	service.update(dto, id);
    }

    @DeleteMapping("/{id}")
    protected void delete(@PathVariable("id") Long id) {
	service.delete(id);
    }

    @GetMapping("/{id}")
    protected ContactViewDto getOne(@PathVariable("id") Long id) {
	return service.getOne(id);
    }

    @GetMapping
    protected List<ContactViewDto> getAll() {
	return service.getAll();
    }
}
