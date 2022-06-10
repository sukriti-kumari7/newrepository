package javaproject;

public class Calculator {
	static int powerInt(int numi, int num2) {
		return ( int) Math.pow(numi, num2);
		
	}
	
	static double powerDouble(double numi, int num2) {
		return Math.pow(numi, num2);
	}

	public static void main(String[] args) {
		Calculator calculate = new Calculator();
		System.out.println(calculate.powerDouble(2.2, 3));
		System.out.println(calculate.powerInt(2, 2));

	}

}
