package com.hsbc.model.beans;

public class FoodItems extends Product {
	
	String vegetarian;
	
	public FoodItems(int itemCode, String itemName, double unitprize, int quantity,String vegetarian){
		
		super(itemCode, itemName, unitprize, quantity, vegetarian);
		this.vegetarian = vegetarian;

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
