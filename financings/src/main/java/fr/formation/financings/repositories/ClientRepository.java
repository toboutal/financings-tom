package fr.formation.financings.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.financings.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
    //
}
