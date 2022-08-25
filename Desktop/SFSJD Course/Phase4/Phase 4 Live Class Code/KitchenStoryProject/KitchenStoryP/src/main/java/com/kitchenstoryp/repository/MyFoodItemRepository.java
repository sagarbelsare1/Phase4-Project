package com.kitchenstoryp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kitchenstoryp.entity.FoodItem;

@Repository
public interface MyFoodItemRepository extends JpaRepository<FoodItem, Integer> {

	// EXAMPLE SPRING DATA METHOD
    List<FoodItem> findEnabledFoods();
}
