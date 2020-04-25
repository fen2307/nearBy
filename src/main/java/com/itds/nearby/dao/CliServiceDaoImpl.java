package com.itds.nearby.dao;

import com.itds.nearby.model.CliService;
import com.itds.nearby.model.CliServiceId;
import org.springframework.stereotype.Repository;

@Repository("CliServiceDao")
public class CliServiceDaoImpl extends AbstractDao<CliServiceId, CliService> implements CliServiceDao {
    @Override
    public void save(CliService cliService) {
        persist(cliService);
    }

    @Override
    public void update(CliService cliService) {
        updateEntity(cliService);
    }

    @Override
    public void delete(CliService cliService) {
        deleteEntity(cliService);
    }

    @Override
    public CliService findById(CliServiceId cliServiceId) {
       return getByKey(cliServiceId);
    }
}
