package com.xworkz.laptop.dao;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.laptop.dto.LaptopDTO;
import com.xworkz.laptop.dto.LaptopDTO;

public class LaptopDAOImpl implements LaptopDAO {

	private List<LaptopDTO> lists;
	private String color;

	public LaptopDAOImpl() {
		lists = new ArrayList<LaptopDTO>();
	}

	@Override
	public void add(LaptopDTO dto) {
		System.out.println("Invoked add with dto type");
		if (dto != null) {
			System.out.println("dto is not null, can add to lists");
			lists.add(dto);
			System.out.println(dto);
		} else {
			System.out.println("dto is null");
		}
	}

	public void add(String name) {
		System.out.println("Invoked add with String type");
		/*
		 * if(name!=null){
		 * System.out.println("name is not null, can add to lists");
		 * lists.add(name); System.out.println(name); }else{
		 * System.out.println("name is not null"); }
		 */

	}

	private boolean name(String name) {
		for (LaptopDTO airportDTO : lists) {
			if (airportDTO.getName().equals(name)) {
				System.out.println("plane is already in list");
				return true;
			}
		}
		return false;
	}

	public void update(String name, double price) {

		System.out.println("invoked update");

		if (name != null) {
			System.out.println("name is not null");
			for (LaptopDTO airportDTO : lists) {
				String plane = airportDTO.getName();
				if (plane.equals(name)) {
					System.out.println("plane before update: " + airportDTO.getColor());
					airportDTO.setColor(color);
					System.out.println("plane after update: " + airportDTO.getColor());
				}
			}
		}

	}

	
	public void delete(String name) {
		System.out.println("invoked delete");
		if (name != null) {
			Iterator<LaptopDTO> iterator = lists.iterator();
			while (iterator.hasNext()) {
				LaptopDTO dto = iterator.next();
				if (dto != null && dto.getName().equals(name)) {
					System.out.println("plane is in list can delete");
					iterator.remove();
				}
			}
		}

	}

	@Override
	public void update(String name, String startPoint) {
		// TODO Auto-generated method stub
		
	}

	public void validAndAdd(String string) {
		// TODO Auto-generated method stub
		
	}

	public void validAndUpdate(String string, double d) {
		// TODO Auto-generated method stub
		
	}

}