package com.mobile;

import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) {
		Stack<String> name = new Stack<>();
		boolean result = name.empty();
		System.out.println("Is the stack empty ? " + result);
		name.push("Sukriti");
		name.push("Smriti");
		name.push("Sweta");
		name.push("Sneha");
		name.push("Sukanya");
		name.push("Saumya");
		name.push("Spardha");
		name.push("Sanskriti");
		
		System.out.println(name);
		
		result = name.empty();
		System.out.println("Is the stack empty ? " + result);
		
		name.pop();
		
		System.out.println(name);
		
		name.pop();
		
		System.out.println(name);
		
		name.pop();
		
		System.out.println(name);
		
	}

}
