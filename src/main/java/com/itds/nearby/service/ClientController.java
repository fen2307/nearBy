package com.itds.nearby.service;

import com.itds.nearby.dao.ClientDao;
import com.itds.nearby.model.Client;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    private final ClientDao repository;

    ClientController(ClientDao repository) {
        this.repository = repository;
    }

    @GetMapping("/clients")
    List<Client> getAll() {
        return repository.findAllClients();
    }

    @PostMapping("/clients")
    void newClient(@RequestBody Client client) {
        repository.save(client);
    }

    @PutMapping("/clients")
    void updateClient(@RequestBody Client client) {
        repository.update(client);
    }

    @GetMapping("/clients/{id}")
    Client findClientById(@PathVariable int id) {
        return repository.findById(id);
    }

    @DeleteMapping("/clients/{id}")
    void deleteClient(@PathVariable int id) {
        repository.delete(repository.findById(id));
    }
}

