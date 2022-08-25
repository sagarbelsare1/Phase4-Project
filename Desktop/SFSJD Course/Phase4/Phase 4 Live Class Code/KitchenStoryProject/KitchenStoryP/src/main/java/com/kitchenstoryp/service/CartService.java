package com.kitchenstoryp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitchenstoryp.entity.FoodItem;
import com.kitchenstoryp.repository.MyFoodItemRepository;

@Service
public class CartService {

	@Autowired
    MyFoodItemRepository mfi;

    public List<FoodItem> getFoodItem(){
        List<FoodItem> foodItemList;
        foodItemList = mfi.findEnabledFoods();

        return foodItemList;

    }
}
