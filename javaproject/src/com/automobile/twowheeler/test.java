package com.automobile.twowheeler;

public class test {

	public static void main(String[] args) {
		Hero feature = new Hero();
		System.out.println(feature.getModelName());
		System.out.println(feature.getRegistrationNumber());
		System.out.println(feature.getownerName());
		System.out.println(feature.getspeed());
		feature.radio();
		Honda feture = new Honda();
		System.out.println(feture.getModelName());
		System.out.println(feture.getRegistrationNumber());
		System.out.println(feture.getspeed());
		System.out.println(feture.getownerName());
		feture.cdPlayer();

		
	}

}
