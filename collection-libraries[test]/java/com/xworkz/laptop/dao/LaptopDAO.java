package com.xworkz.laptop.dao;

import com.xworkz.laptop.dto.LaptopDTO;

public interface LaptopDAO {
	
	public void add(LaptopDTO dto);
	
	public void add(String name);
	
	public void update(String name,String startPoint);
	
	public void delete(String name);


	public static String getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

}
