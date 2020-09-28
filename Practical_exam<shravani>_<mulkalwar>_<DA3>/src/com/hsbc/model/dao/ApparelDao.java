package com.hsbc.model.dao;

import com.hsbc.model.beans.Apparel;



public interface ApparelDao {
	
	public Apparel add(Apparel apparel);
	public Apparel[] fetchApparel();
	
	

}
