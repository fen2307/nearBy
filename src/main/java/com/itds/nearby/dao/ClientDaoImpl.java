package com.itds.nearby.dao;

import com.itds.nearby.model.Client;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ClientDao")
public class ClientDaoImpl extends AbstractDao<Integer, Client> implements ClientDao {
    public Client findById(int id) {
        return getByKey(id);
    }

    @Override
    public void save(Client client) {
        persist(client);
    }

    @Override
    public void delete(Client client) {
        deleteEntity(client);
    }

    @Override
    public void update(Client client) {
        updateEntity(client);
    }

    @Override
    public List<Client> findAllClients() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("login"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return (List<Client>) criteria.list();
    }
}
