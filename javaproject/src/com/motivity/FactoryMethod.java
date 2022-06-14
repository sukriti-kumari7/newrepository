package com.motivity;

abstract class Lava{
	abstract void name();
}

class SmartPhone extends Lava{

	@Override
	void name() {
		System.out.println("SmartPhones available name is here.");
		System.out.println("Lava Agni 5G");
		System.out.println("Sony Xperia");
		System.out.println("Lava Z6");
	}
	
}

class Laptop extends Lava{

	@Override
	void name() {
		System.out.println("Laptops features is present here.");
		System.out.println("Lava Helium 12 c121");
		System.out.println("Lava c141 thin and light");
		System.out.println("Twinpad");
		
	}
	
}

class Probuds extends Lava{

	@Override
	void name() {

		System.out.println("True Wireless");
		System.out.println("Wireless Headphone");
		System.out.println("Bluetooth 5.0");
		System.out.println("Microphone");
		
		
	}
	
}

class Productname{
	Lava getLava(String productname) {
		if(productname.equals("SmartPhone")) {
			return new SmartPhone();
		}else if(productname.equals("Laptop")) {
			return new Laptop();
		}else if(productname.equals("Probuds")) {
			return new Probuds();
		}else {
			return null;
		}
	}
}

public class FactoryMethod {

	public static void main(String[] args) {
		
		Productname product = new Productname();
		Lava products =product.getLava("SmartPhone"); 
		products.name();

	}

}
