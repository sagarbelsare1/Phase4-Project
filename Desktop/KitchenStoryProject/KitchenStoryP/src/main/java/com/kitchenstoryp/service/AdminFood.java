package com.kitchenstoryp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitchenstoryp.entity.FoodItem;
import com.kitchenstoryp.repository.FoodItemRepository;

@Service
public class AdminFood {

	@Autowired
    FoodItemRepository fir;
    public boolean addFoodItem(FoodItem fi){
        fir.save(fi);
        return true;
    }

    public List<FoodItem> getFoodItem(){
        List<FoodItem> foodItemList = new ArrayList<>();
        foodItemList = fir.findAll();

        return foodItemList;

    }
    public boolean updateFoodItem(FoodItem fi){
        fir.save(fi);
        return true;
    }

}
