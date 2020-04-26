package com.itds.nearby.service;

import com.google.maps.errors.ApiException;
import com.google.maps.model.LatLng;
import com.itds.nearby.dao.ClientDao;
import com.itds.nearby.geolocation.EarthSearch;
import com.itds.nearby.model.Client;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
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
    void newClient(@RequestBody Client client) throws InterruptedException, ApiException, IOException {
        LatLng latlng = EarthSearch.lookupCoord(client.getAddress()) ;
        client.setLatitude(latlng.lat);
        client.setLongitude(latlng.lng);
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

