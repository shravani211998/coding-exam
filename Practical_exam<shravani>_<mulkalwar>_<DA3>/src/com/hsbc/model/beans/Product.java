package com.hsbc.model.beans;

public class Product {
	
	private int itemCode;
	private String itemName;
	private double unitprize;
	private int quantity;
	
	
	public Product(int itemCode, String itemName, double unitprize, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitprize = unitprize;
		this.quantity = quantity;
	}
	public Product(int itemCode, String itemName, double unitprize, int quantity,String vegetarian) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitprize = unitprize;
		this.quantity = quantity;
		this.vegetarian = vegetarian;
	}
	public Product(int itemCode, String itemName, double unitprize, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitprize = unitprize;
		this.quantity = quantity;
	}
	public Product(int itemCode, String itemName, double unitprize, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitprize = unitprize;
		this.quantity = quantity;
	}
	
	


	public Product() {
		super();
	}


	public int getItemCode() {
		return itemCode;
	}


	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public double getUnitprize() {
		return unitprize;
	}


	public void setUnitprize(double unitprize) {
		this.unitprize = unitprize;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Product [itemCode=" + itemCode + ", itemName=" + itemName + ", unitprize=" + unitprize + ", quantity="
				+ quantity + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
