package com.hsbc.model.exception;

public class ProductNotFoundException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public ProductNotFoundException(){
		super("product not found");
	}
	
	public ProductNotFoundException(String msg)
	{
		super(msg);
	}

}
