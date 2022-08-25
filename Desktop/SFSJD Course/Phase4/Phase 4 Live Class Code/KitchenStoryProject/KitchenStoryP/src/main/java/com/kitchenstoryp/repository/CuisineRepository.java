package com.kitchenstoryp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kitchenstoryp.entity.Cuisine;

@Repository
public interface CuisineRepository extends CrudRepository<Cuisine, Integer>  {

	Cuisine save(Cuisine cu);
    List<Cuisine> findAll();
}
