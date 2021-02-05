package com.xworkz.laptop.service;


import com.xworkz.laptop.dao.LaptopDAOImpl;
import com.xworkz.laptop.dto.LaptopDTO;


public class ValidationTester {

	public static void main(String[] args) {
		
		LaptopDTO dto1=new LaptopDTO("HP",39990.00,"White");
		LaptopDTO dto2=new LaptopDTO("LENOVO",44000.00, "Black");
		
		LaptopDAOImpl service1=new LaptopDAOImpl();
		service1.validAndAdd(dto1);
		service1.validAndAdd(dto2);
		service1.validAndUpdate("HP",39990.00);
		service1.validAndAdd("LENOVO");

	}

}

