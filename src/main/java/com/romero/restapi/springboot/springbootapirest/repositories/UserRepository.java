package com.romero.restapi.springboot.springbootapirest.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.romero.restapi.springboot.springbootapirest.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{
    boolean existsByUsername(String username);

    Optional<User> findByUsername(String username);
}
