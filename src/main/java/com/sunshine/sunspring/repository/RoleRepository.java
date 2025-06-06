package com.sunshine.sunspring.repository;

import com.sunshine.sunspring.model.Role;
import com.sunshine.sunspring.model.ERole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
