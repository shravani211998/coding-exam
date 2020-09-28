package com.hsbc.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.model.beans.FoodItems;

public class FoodItemDaoImpl implements FoodItemDao {
	
	
	ArrayList<FoodItems> list = new ArrayList<FoodItems>();
	
	@Override
	public FoodItems add(FoodItems foodItems) {
		list.add(foodItems);
		return foodItems;
		
		
	}
	
	@Override
	public FoodItems[] fetchFoodItem() {
		FoodItems[] food_array = list.toArray(new FoodItems[list.size()]);
		return food_array;
			
	}
	

}
