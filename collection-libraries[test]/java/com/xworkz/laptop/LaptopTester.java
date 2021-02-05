package com.xworkz.laptop;

import com.xworkz.laptop.dao.LaptopDAO;
import com.xworkz.laptop.dao.LaptopDAOImpl;
import com.xworkz.laptop.dto.LaptopDTO;

public class LaptopTester {

	public static void main(String[] args) {
		
		LaptopDTO dto1=new LaptopDTO("HP", 38000.00, "Black");
		
		LaptopDAO dao1=new LaptopDAOImpl();
		dao1.add(dto1);
		
		dao1.update("DELL","Silver");
		dao1.delete("Black");

	}

}