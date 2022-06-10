package com.mobile;

interface Mymobile {
	void brandName();
	void screensize();
	void memorysize();
	void camerapixel();
	void mediaplayer();
}
interface Earphone{
	void earphoneType();
}
interface Charger{
	void chargerType();
	void battryCapacity();
}

//Multiple Implementation

abstract class Android implements Mymobile, Charger{
	public abstract void mediaplayer();
	
	void  maps() {
		System.out.println("Google Map is present in AndroidPhones to find exact Location.");
	}
	void colling() {
		System.out.println("both key board and call history is present .");
		}
	void switchOnAndOf() {
		System.out.println("Power buton is available for switch on and off .");
	
	}
}

//Inheritance and implements both together

class Oppo extends Android implements Earphone{

	@Override
	public void screensize() {
		System.out.println("Screensize is 6.4 inch .");
		
	}

	@Override
	public void memorysize() {
		System.out.println("8GB RAM and 128GB ROM .");
		
	}

	@Override
	public void mediaplayer() {
		System.out.println("Multi Media player is available .");
		
	}

	@Override
	public void camerapixel() {
		System.out.println("Camera is of 48Mp, 8MP, 2MP and 2MP .");
		
	}

	@Override
	public  void brandName() {
		System.out.println("Oppo F17 Pro");
		
	}

	@Override
	public void earphoneType() {
		System.out.println("Wired EarPhone .");
		
	}

	@Override
	public void battryCapacity() {
		
		System.out.println("Battry capacity is 4000 mAh.");
	}

	@Override
	public void chargerType() {
		System.out.println("Oppo f17 charger type is 'Type-c' .");
		
	}
	
}
public class BuyMobile {

	public static void main(String[] args) {
		Oppo feature = new Oppo();
		feature.brandName();
		feature.screensize();
		feature. memorysize();
		feature.camerapixel();
		feature.mediaplayer();
		feature.earphoneType();
		feature.battryCapacity();
		feature.chargerType();
		feature.maps() ;
		feature.colling();
		feature.switchOnAndOf();
	}

}
