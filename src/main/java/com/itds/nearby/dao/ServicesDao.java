package com.itds.nearby.dao;

import com.itds.nearby.model.Service;

import java.util.List;

public interface ServicesDao {
    Service findById(int id);

    void save(Service service);

    void update(Service service);

    void delete(Service service);

    List<Service> findAllServices();


}
