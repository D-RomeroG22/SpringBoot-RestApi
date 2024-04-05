package com.romero.restapi.springboot.springbootapirest.services;

import java.util.List;

import com.romero.restapi.springboot.springbootapirest.entities.User;

public interface UserService {
    
    List<User> findAll();

    User save(User user);

    boolean existsByUsername(String username);
}
