package com.webapp.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.webapp.demo.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> {

}
