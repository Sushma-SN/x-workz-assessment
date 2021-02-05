package com.xworkz.laptop.dto;

import com.xworkz.laptop.dto.LaptopDTO;

public class LaptopDTO {
	

	private String name;
	private double price;
	private String color;

	public LaptopDTO() {

		System.out.println("created AirportDTO");
	}

	public LaptopDTO(String name, double price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "LaptopDTO [name=" + name + ", price=" + price + ", color=" + color + "]";
	
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	}
	

		