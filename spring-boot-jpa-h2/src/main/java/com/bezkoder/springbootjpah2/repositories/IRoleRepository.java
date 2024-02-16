package com.bezkoder.springbootjpah2.repositories;

import com.bezkoder.springbootjpah2.models.ERole;
import com.bezkoder.springbootjpah2.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}