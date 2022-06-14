package com.library;

public class AdultUser implements LibraryUser{
    int age;
    String bookType;
	@Override
	public void registerAccount() {
		if( age > 12) {
			requestBook();
			
			System.out.println("You have successfully registered under a Adult Account");
		
			}
		
	}

	@Override
	public void requestBook() {
		bookType = "Course Book ";
		System.out.println("Your Book request is Granted.");
		System.out.println("Your Book " + bookType + "should be returned within 7 days.");
		
	}
	

}
