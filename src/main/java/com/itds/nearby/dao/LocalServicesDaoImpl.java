package com.itds.nearby.dao;

import com.itds.nearby.model.LocalService;
import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("LocalServicesDao")
public class LocalServicesDaoImpl extends AbstractDao<Integer, LocalService> implements LocalServicesDao {
    @Override
    public List<LocalService> findAllLocalServices(Integer id) {
        SQLQuery query = getSession().createSQLQuery("select * from localservices where logged_Idcli = " + id);
        List<LocalService> ls = new ArrayList<>();
        List<Object[]> rows = query.list();
        for (Object[] row : rows) {
            LocalService l = new LocalService();
            l.setLoggedIdCli(Integer.parseInt(row[0].toString()));
            l.setLogin(row[1].toString());
            l.setDirection(row[2].toString());
            l.setDescription(row[3].toString());
            l.setApproach(row[4].toString());
            l.setHumanDistance(row[5].toString());
            l.setIsGLobal(row[6].toString());
            l.setDistance(Double.parseDouble(row[7].toString()));
            l.setEmail(row[8].toString());
            ls.add(l);
        }

        return ls;
    }

}
