package com.hsbc.model.dao;

import com.hsbc.model.beans.FoodItems;
public interface FoodItemDao {
	
	public FoodItems add(FoodItems foodItems);
	public FoodItems[] fetchFoodItem();
	

}
