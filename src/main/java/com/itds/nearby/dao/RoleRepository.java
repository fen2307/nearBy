package com.itds.nearby.dao;

import java.util.Optional;

import com.itds.nearby.auth.ERole;
import com.itds.nearby.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
