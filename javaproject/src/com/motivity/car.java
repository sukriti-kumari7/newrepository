package com.motivity;

class FourWhiler{
	void touchscreen() {}
	void climetControle() {}
	void sunroof() {}
	void musicSystem() {}
	void charging() {}
	void color() {}
	void milage() {}
}
class Fortuner extends FourWhiler{
	void touchscreen() {
		System.out.println("TouchScreen is present Fortuner");
	}
	void climetControle() {
		System.out.println("Climet controle is present in Fortuner");
	}
	void sunroof() {
		System.out.println("SunRoof is not present in Fortuner");
	}
	void musicSystem() {
		System.out.println("Music System is present in Fortuner");
	}
	void charging() {
		System.out.println("Charging point  for Mobile is present in Fortuner");
	}
	void color() {
		System.out.println("Color option in Fortuner is Brown, Black, White in different sheds");
	}
	void milage() {
		System.out.println("Mileage of Fortuner is in between 10.01 to 15.04");
	}
}
public class car {

	public static void main(String[] args) {
		Fortuner feature = new Fortuner();
		feature.touchscreen();
		feature.climetControle();
		feature.sunroof();
		feature.musicSystem();
		feature.charging();
		feature.color();
		feature.milage();

	}

}
