package com.itds.nearby.dao;

import com.itds.nearby.model.LocalService;

import java.util.List;

public interface LocalServicesDao {
    List<LocalService> findAllLocalServices(Integer id);
}
