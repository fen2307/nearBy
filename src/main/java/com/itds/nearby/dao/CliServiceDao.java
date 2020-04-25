package com.itds.nearby.dao;

import com.itds.nearby.model.CliService;
import com.itds.nearby.model.CliServiceId;

public interface CliServiceDao {
    void save(CliService cliService);

    void update(CliService cliService);

    void delete(CliService cliService);

    CliService findById(CliServiceId cliServiceId);

}
