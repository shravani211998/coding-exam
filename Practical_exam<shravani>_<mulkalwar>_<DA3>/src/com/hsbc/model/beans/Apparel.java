package com.hsbc.model.beans;

public class Apparel extends Product {
	
	
	String size;
	String material;
	
	public Apparel(int itemCode, String itemName, double unitprize, int quantity,String size,String material){
		
		super(itemCode, itemName, unitprize, quantity, size, material);
		this.size = size;
		this.material = material;

		
		
	}
	

}
