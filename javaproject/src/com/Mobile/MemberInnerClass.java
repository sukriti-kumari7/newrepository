package com.Mobile;

abstract class ANdroid{
	abstract void android();
}
abstract class Screen{
	abstract void screen();
}
class AppleBrand{
	int price;
	void newproject() {
		System.out.println("Our new Project is Mobile");
		price = 60000;
		System.out.println("Approx Price is " + price);
		class Discription{
			void discription() {
				System.out.println("We have created a beautiful hyfeatured Project.");
				System.out.println("The iPhone is a line of smartphones designed and marketed by Apple Inc. "
						+ "that use Apple's iOS mobile operating system. The first-generation iPhone was announced "
						+ "by then-Apple CEO Steve Jobs on January 9, 2007."
						+ " Since then, Apple has annually released new iPhone models and iOS updates.");
				price = 69000;
				System.out.println("Accurate Price is " + price);
			}
		}
		Discription explaination = new Discription();
		explaination.discription();
	}
	class AppleIPhone{
		String name() {
			return "Apple Iphone";
		}
	}
	class AppleFeature{
		void features() {
			System.out.println("It contains 64GB RAM and 128GB ROM");
			System.out.println("Height is 150.9mm and Width is 75.7mm and weight is 194 grams.");
			System.out.println("Display size is 6.1 inch.");
			System.out.println("Dual 12MP Ultra Wide and Wide Cameras .");
		}
	}
}

public class MemberInnerClass {
	public static void main(String[] args) {
		AppleBrand launch = new AppleBrand();
		launch.newproject();
		AppleBrand.AppleIPhone projectName = launch.new AppleIPhone();
		System.out.println("Our new project is " + projectName.name());
		AppleBrand.AppleFeature feture= launch.new AppleFeature();
		feture.features();
		//anonymous inner class
		
		ANdroid apple = new ANdroid(){
			void android() {
				System.out.println("Dual sim feature .");
			}
		};
		apple.android();
		new Screen() {
			void screen() {
				System.out.println("Touch screen feature .");
			}
		}.screen();
	}
}
