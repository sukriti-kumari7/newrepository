package com.Mobile;
class Androied{
	String brandName;
	int price;
	int romsize;
	int ramsize;
	float screensize;
	int camerapixel;
	String screenType;
	
	Androied(){
		this(50,"Touch screen");
		System.out.println("Grand features of My Phone. ");
	}
	Androied(String brandName){
		this.brandName = brandName;
		System.out.println("Brand name is " + brandName);
	}
	Androied(int price){
		this("Apple");
		this.price = price;
		System.out.println("Price of Iphone is " + price);
	}
	Androied(int romsize, int ramsize){
		this(69000);
		this.romsize = romsize;
		System.out.println("RAM size is " + ramsize + " ROM size is " + romsize);
	}
	Androied(float screensize){
		this(16, 84);
		this.screensize = screensize;
		System.out.println("Screen size is " + screensize);
	}
	Androied(int camerapixel,String screenType){
		this(6.4f);
		this.camerapixel = camerapixel;
		this.screenType = screenType;
		System.out.println( "Camera pixel is "+ camerapixel + " And Screen type is " + screenType );
	}
}
class Prise extends Androied{
	void prices() {
		System.out.println(super.price);
	}
}

public class ConstructorOverloading {
	
	public static void main(String[] args) {
		Androied apple = new Androied();
		 Prise re = new Prise();
		 re.prices();
	}

}
