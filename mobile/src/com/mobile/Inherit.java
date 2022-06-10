package com.mobile;
//herarical inheritence.
//Up casting
class Mobile{
	
	void calculator() {
		System.out.println("It has Calculator");
	}
	void screen() {}
	void callingSystem() {
		System.out.println("It has number Keyboard to call any person");
		System.out.println("It has option to save number to call any person with name.");
	}
	void mediaPlayer(){
		System.out.println("It has Media player");
	}
	void maps() {
		System.out.println("It contains Google maps.");
	}
	void memory() {}
	void camera() {}
	void brand() {}
	}

class Redmi extends Mobile{
	void brand() {
		System.out.println("Redmi Note10");
	}
	void screen() {
		System.out.println("It's Screen size is 7 inch.");
	}
	void memory() {
		System.out.println("memory is of 64 GB.");
	}
	void camera() {
		System.out.println("Camera is of 48 mp.");
	}
}
class Apple extends Mobile{
	void brand() {
		System.out.println("Apple I Phone");
	}
	void screen() {
		System.out.println("It's Screen size is 12 inch.");
	}
	void memory() {
		System.out.println("memory is of 128 GB.");
	}
	void camera() {
		System.out.println("Camera is of 60 mp.");
	}
}
class Motorola extends Mobile{
	void brand() {
		System.out.println("Moto E4");
	}
	void screen() {
		System.out.println("It's Screen size is 5 inch.");
	}
	void memory() {
		System.out.println("memory is of 8 GB.");
	}
	void camera() {
		System.out.println("Camera is of 48 mp.");
	}
}

public class Inherit {

	public static void main(String[] args) {
		Mobile features = new Redmi();
		 features.brand();
		 features.memory();
		 features.mediaPlayer();
		 features.screen();
		 features.callingSystem();
		 features.camera();
		 features.maps();
		 features.calculator();
		 features = new Apple();
		 features.brand();
		 features.memory();
		 features.mediaPlayer();
		 features.screen();
		 features.callingSystem();
		 features.camera();
		 features.maps();
		 features.calculator();
		 features = new Motorola();
		 features.brand();
		 features.memory();
		 features.mediaPlayer();
		 features.screen();
		 features.callingSystem();
		 features.camera();
		 features.maps();
		 features.calculator();
	}

}
