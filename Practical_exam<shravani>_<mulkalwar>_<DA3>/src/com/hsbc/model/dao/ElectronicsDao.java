package com.hsbc.model.dao;
import com.hsbc.model.beans.Electronics;


public interface ElectronicsDao {

	public Electronics add(Electronics electronics);
	public Electronics[] fetchElectronics();
	
	
}
