//package com.itds.nearby.security;
//
//import com.itds.nearby.model.Client;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.Collections;
//
//public class UserPrincipal implements UserDetails {
//    private Client client;
//
//    public UserPrincipal(Client client) {
//        this.client = client;
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return Collections.singleton(new SimpleGrantedAuthority("USER"));
//    }
//
//    @Override
//    public String getPassword() {
//        return client.getPassword();
//    }
//
//    @Override
//    public String getUsername() {
//        return client.getLogin();
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
