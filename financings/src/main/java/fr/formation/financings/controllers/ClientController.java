package fr.formation.financings.controllers;

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

import fr.formation.financings.dtos.ClientDto;
import fr.formation.financings.entities.Client;
import fr.formation.financings.services.ClientService;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @PostMapping
    protected void create(@Valid @RequestBody ClientDto dto) {
	service.create(dto);
    }

    @DeleteMapping("/{id}")
    protected void delete(Long id) {
	service.delete(id);
    }

    @GetMapping("/{id}")
    protected Client getOne(Long id) {
	return service.getOne(id);
    }

    @PutMapping("/{id}")
    protected void update(@Valid @RequestBody ClientDto dto,
	    @PathVariable("id") Long id) {
	service.update(dto, id);
    }
}
