package com.hsbc.model.dao;

import java.util.ArrayList;

import com.hsbc.model.beans.Electronics;

public class ElectronicsDaoImpl implements ElectronicsDao {
	
ArrayList<Electronics> list = new ArrayList<Electronics>();
	
	@Override
	public Electronics add(Electronics electronics) {
		list.add(electronics);
		return electronics;
		
		
	}
	
	@Override
	public Electronics[] fetchElectronics() {
		Electronics[] electronics_array = list.toArray(new Electronics[list.size()]);
		return electronics_array;
			
	}

}
