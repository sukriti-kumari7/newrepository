package com.motivity;

class Values{
	void display() {
		System.out.println("No Values");
	}
	void display(int a) {
		System.out.println(a);
	}
	void display(float b) {
		System.out.println(b);
	}
	void display(double c) {
		System.out.println(c);
	}
	void display(String d) {
		System.out.println(d);
	}
	void display(int a, Float b) {
		System.out.println(a +" And "+ b);
	}
	
}

public class Overloading {

	public static void main(String[] args) {
		Values value = new Values();
		value.display();
		int a = 10;
		float b = 10.5f;
		value.display(a);
		value.display(b);
		double c = 1000.006;
		value.display(c);
		value.display("Sukriti");
		value.display(a,b);

	}

 }
