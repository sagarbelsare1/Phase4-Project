package com.kitchenstoryp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitchenstoryp.entity.Cuisine;
import com.kitchenstoryp.repository.CuisineRepository;

@Service
public class CuisineService {

	@Autowired
    CuisineRepository cr;

    public boolean addCuisine(Cuisine fi){
        cr.save(fi);
        return true;
    }

    public List<Cuisine> getCuisineList(){

        List<Cuisine> cl = cr.findAll();
        return cl;
    }
}
