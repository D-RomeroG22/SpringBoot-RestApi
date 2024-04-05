package com.romero.restapi.springboot.springbootapirest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.romero.restapi.springboot.springbootapirest.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    boolean existsBySku(String sku);
}

