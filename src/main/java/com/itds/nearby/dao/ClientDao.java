package com.itds.nearby.dao;

import com.itds.nearby.model.Client;

import java.util.List;

public interface ClientDao {
    Client findById(int id);

    void save(Client client);

    List<Client> findAllClients();
}
