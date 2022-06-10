package com.mobile;

public class VariableTesting {
	int price;
	static String brand;
	static float size; 
	static float rate() {
		//price = 10000;
		size = 4.5f;
		return size;
	}
	void brandName() {
		brand = "Motorola";
		price = 10000;
		System.out.println(brand);
		System.out.println(price);
	}

	public static void main(String[] args) {
		VariableTesting test = new VariableTesting();
		test.brandName();
		System.out.println(VariableTesting.rate());
		
	}

}
