package com.romero.restapi.springboot.springbootapirest.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.romero.restapi.springboot.springbootapirest.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

    Optional<Role> findByName(String name);
    
}