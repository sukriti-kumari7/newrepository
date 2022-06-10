package com.mobile;

abstract class Obj{
	  abstract void screenSize();
	  abstract void screenSize(int a);
	  abstract void screenSize(int a, float b);
	 //we can overload abstract method
	 
}
class Feature extends Obj{
	
	void screenSize(){
		System.out.println("Mobile size is 4.5 inches");
	}
	void screenSize(int a) {
		System.out.println("Mobile size is " + a + "inches");
	}
	void screenSize(int a, float b) {
		System.out.println("Both Mobile size is " + a + " and " + b + " inches");
	}
}

public class AbstractMethod {

	public static void main(String[] args) {
		Feature feture = new Feature();
		feture.screenSize();
		int a = 7;
		feture.screenSize( a);
		float b = 4.5f;
		feture.screenSize(a, b);
		
	}

}
