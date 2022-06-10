package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {
	
	public String getModelName() {
		return "Hero Glamour"; 
	}
	public String getRegistrationNumber() {
		return "34785"; 
	}
	public String getownerName() {
		return "Sukriti Thakur"; 
	}
	
	public int getspeed() {
		return 35;
	}
	public void radio() {
		System.out.println("The facility to play the radio is available. ");
	}
}

class Honda extends Vehicle{
	public String getModelName() {
		return "Honda city"; 
	}
	public String getRegistrationNumber() {
		return "3789"; 
	}
	public String getownerName() {
		return "Abhinaw Prakash"; 
	}
	public int getspeed() {
		return 60;
	}
	public void cdPlayer() {
		System.out.println("The facility to control the cd player is available. ");
	}
}
