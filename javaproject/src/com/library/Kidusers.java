package com.library;

public class Kidusers implements LibraryUser{

	 int age;
	 String bookType;
	public static void main(String[] args) {
		
		Kidusers process = new Kidusers();
		process.age = 10;
		process.bookType = "Angle Story";
		process.registerAccount();

	}

	@Override
	public void registerAccount() {
		if( age < 12) {
			
			
			System.out.println("You have successfully registered under a Kids Account");
			
			requestBook();
		
			}else
			{
				AdultUser permission = new AdultUser();
				permission.registerAccount();
				permission.requestBook();
			}
		}
		

	@Override
	public void requestBook() {
		
		System.out.println("Your Book request is Granted.");
		System.out.println("Your Book " + bookType + " should be returned within 10 days.");
		
	}

}
