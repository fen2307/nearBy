//package com.itds.nearby.security;
//
//import com.itds.nearby.dao.ClientDao;
//import com.itds.nearby.model.Client;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class MyUserDetailService implements UserDetailsService {
//
//    final
//    ClientDao clientDao;
//
//    public MyUserDetailService(ClientDao clientDao) {
//        this.clientDao = clientDao;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        Client client = clientDao.findClientByUserName(s);
//        if (client == null) {
//            throw new UsernameNotFoundException("User 404");
//        }
//        return new UserPrincipal(client);
//    }
//}
