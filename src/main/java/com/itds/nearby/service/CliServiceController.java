package com.itds.nearby.service;

import com.itds.nearby.dao.CliServiceDao;
import com.itds.nearby.model.CliService;
import com.itds.nearby.model.CliServiceId;
import org.springframework.web.bind.annotation.*;

@RestController
public class CliServiceController {
    private final CliServiceDao repository;

    public CliServiceController(CliServiceDao cliServiceDao) {
        this.repository = cliServiceDao;
    }

    @PostMapping("/cliservice")
    void newCliService(@RequestBody CliService cliService) {
        repository.save(cliService);
    }

    @PutMapping("/cliservice")
    void updateCliService(@RequestBody CliService cliService) {
        repository.update(cliService);
    }

    @DeleteMapping("/cliservice/{idCli}/{idSer}")
    void deleteCliService(@PathVariable int idCli, @PathVariable int idSer) {
        repository.delete(repository.findById(new CliServiceId(idCli, idSer)));
    }

    @GetMapping("/cliservice/{idCli}/{idSer}")
    CliService findCliService(@PathVariable int idCli, @PathVariable int idSer) {
        return repository.findById(new CliServiceId(idCli, idSer));
    }
}
