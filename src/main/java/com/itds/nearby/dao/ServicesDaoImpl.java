package com.itds.nearby.dao;

import com.itds.nearby.model.Client;
import com.itds.nearby.model.Service;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ServicesDao")
public class ServicesDaoImpl extends AbstractDao<Integer, Service> implements ServicesDao {
    @Override
    public Service findById(int id) {
        return getByKey(id);
    }

    @Override
    public void save(Service service) {
        persist(service);
    }

    @Override
    public void update(Service service) {
        updateEntity(service);
    }

    @Override
    public void delete(Service service) {
        deleteEntity(service);
    }

    @Override
    public List<Service> findAllServices() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("description"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return (List<Service>) criteria.list();
    }
}
