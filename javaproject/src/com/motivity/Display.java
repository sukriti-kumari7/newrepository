package com.motivity;

class Cources{
	void enrole(String sub1) {
		System.out.println("Java Course is enroled.");
	}
	void enrole(String sub1,String sub2) {
		System.out.println("Java  and Python Course is enroled.");
	}
	void enrole(String sub1, String sub2, String sub3) {
		System.out.println("Java, Python and .Net Course is enroled.");
	}
	void enrole(String sub1, String sub2, String sub3, String sub4) {
		System.out.println("Java, Python, .Net and Web Designing course is enroled.");
	}
	void enrole(String sub1, String sub2, String sub3, String sub4, String sub5) {
		System.out.println("Java, Python, .Net, Web Designing and Web Development course is enroled.");
	}
}

public class Display {

	public static void main(String[] args) {
		Cources course = new Cources();
		System.out.println("List of Course you enroled");
		course.enrole("Java");
		course.enrole("Java","Python");
		course.enrole("Java", "Python", ".Net");
		course.enrole("Java", "Python", ".Net", "Web Designing");
		course.enrole("Java", "Python", ".Net", "Web Designing", "Web development");
		
	}

}
