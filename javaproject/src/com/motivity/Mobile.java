package com.motivity;
class Features{
	 int prise;
	static String name ="Motorola";
	static String color;
	float camera_pixels = 16.0f;
	
}
public class Mobile {
	
	public static void main(String[] args) { 
		 Features m = new Features();
		 m.prise = 13000;
		 String name = Features.name;
		 Features.color = "yellow";
		System.out.println("Price of the Mobile is : " + m.prise);
		System.out.println("Company name is : " + name);
		System.out.println("The color of mobile is : " + Features.color);
		System.out.println("");

	}

}
