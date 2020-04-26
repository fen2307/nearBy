package com.itds.nearby.service;

import com.itds.nearby.dao.LocalServicesDao;
import com.itds.nearby.dao.ServicesDao;
import com.itds.nearby.model.LocalService;
import com.itds.nearby.model.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServiceController {
    private final ServicesDao repository;
    private final LocalServicesDao localServicesDao;

    public ServiceController(ServicesDao repository, LocalServicesDao localServicesDao) {
        this.repository = repository;
        this.localServicesDao = localServicesDao;
    }

    @GetMapping("/services")
    List<Service> all() {
        return repository.findAllServices();
    }

    @GetMapping("/localservices/{id}")
    List<LocalService> allLocal(@PathVariable int id) {
        return localServicesDao.findAllLocalServices(id);
    }

    @PostMapping("/services")
    void newService(@RequestBody Service service) {
        repository.save(service);
    }

    @PutMapping("/services")
    void updateService(@RequestBody Service service) {
        repository.update(service);
    }


    @GetMapping("/services/{id}")
    Service findServiceById(@PathVariable int id) {
        return repository.findById(id);
    }

    @DeleteMapping("/services/{id}")
    void deleteService(@PathVariable int id) {
        repository.delete(repository.findById(id));
    }
}
