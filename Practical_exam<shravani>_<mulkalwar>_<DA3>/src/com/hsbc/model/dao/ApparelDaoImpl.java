package com.hsbc.model.dao;

import java.util.ArrayList;

import com.hsbc.model.beans.Apparel;

public class ApparelDaoImpl implements ApparelDao{
	
ArrayList<Apparel> list = new ArrayList<Apparel>();
	
	@Override
	public Apparel add(Apparel apparel) {
		list.add(apparel);
		return apparel;
		
		
	}
	
	@Override
	public Apparel[] fetchApparel() {
		Apparel[] apparel_array = list.toArray(new Apparel[list.size()]);
		return apparel_array;
			
	}
	

}
