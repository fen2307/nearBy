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

    // Aggregate root

    @GetMapping("/clients")
    List<Client> all() {
        return repository.findAllClients();
    }

    @PostMapping("/clients")
    void newEmployee(@RequestBody Client newClient) {
        repository.save(newClient);
    }

    // Single item

    @GetMapping("/clients/{id}")
    Client one(@PathVariable int id) {
        return repository.findById(id);
    }


//    @DeleteMapping("/employees/{id}")
//    void deleteEmployee(@PathVariable Long id) {
//        repository.deleteById(id);
//    }
}

