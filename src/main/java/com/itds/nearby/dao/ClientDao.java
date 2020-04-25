package com.itds.nearby.dao;

import com.itds.nearby.model.Client;

import java.util.List;

public interface ClientDao {
    Client findById(int id);

    void save(Client client);

    void update(Client client);

    void delete(Client client);

    List<Client> findAllClients();
}
