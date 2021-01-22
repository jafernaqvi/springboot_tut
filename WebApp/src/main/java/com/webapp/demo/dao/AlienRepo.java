package com.webapp.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.webapp.demo.Alien;


public interface AlienRepo extends CrudRepository<Alien, Integer> {
	List<Alien> findByLang(String lang);
	List<Alien> findByIdGreaterThan(int id);
	
	@Query("from Alien where id=?1")
	List<Alien> findByCustomQuery(int id);
}
