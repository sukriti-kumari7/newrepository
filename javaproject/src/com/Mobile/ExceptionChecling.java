package com.Mobile;

class Exception{
	int dividend;
	int divisor;
	
	void add(){
		dividend = 128;
		divisor = 0;
		//Arithmetic Exception
		try {
			int quotient = dividend/divisor;
			System.out.println(quotient);
		}
	
		catch(ArithmeticException e) {
			System.out.println("Zero cant be divisor give a valid divisor");
		}
	}
	//Array IndexOutOfBoundException
	void printArr() {
		int arr[] = new int[5];
		try {
		for(int i = 0; i <= arr.length; i++) {
			arr[i] = i;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("You can not give value more than indexes.");
		}
		
	}
	
	// Null Pointer Exception
	String s = null;
	
	void printstr() {
		try{
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println("Cannot invoke \"String.length()\" because \"this.s\" is null.");
		}
	}
	
	
	//Number Format Exception
	
	String st = "abc";
	void printvalue() {
		try {
		int i = Integer.parseInt(st);
		System.out.println(st);
		}
		catch (NumberFormatException e) {
			System.out.println("For input string: abc  is not converted to integer");
		}
	}
	
	//Class Casting exception
	
	
	void show() {
		Object test = new String("ClassCastingException");
		
		try {
			System.out.println((int)test);
		} catch (ClassCastException e) {
			System.out.println("class java.lang.String cannot be cast to class java.lang.Integer");
		}
	}
	
	//ArayStore Exception
	
	void store() {
		Object[] name = new String[4];
		try {
			name[3] = 4;
			System.out.println();
		}
		catch(ArrayStoreException e) {
			System.out.println(e);
		}
	}
	
}

public class ExceptionChecling {
	public static void main(String[] args) {
		Exception check = new Exception();
		check.add();
		check.printArr();
		check.printstr();
		check.printvalue();
		check.show();
		check.store();
	}

}
