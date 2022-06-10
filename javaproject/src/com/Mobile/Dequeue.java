package com.Mobile;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {

	public static void main(String[] args) {
		Deque <Integer> operation = new LinkedList<Integer>();
		
		operation.add(45);
		operation.add(798);
		operation.add(98);
		operation.add(345);
		operation.add(4789);
		operation.add(43);
		operation.add(1234);
		operation.add(78);
		operation.add(45);
		
		System.out.println(operation);
		
		operation.addFirst(0);
		
		System.out.println(operation);
		
		operation.addLast(0);
		
		System.out.println(operation);
		
		operation.push(90);
		
		System.out.println(operation);
		
		operation.pop();
		
		System.out.println(operation);
		
		operation.offer(5);
		
		System.out.println(operation);
		
		operation.offerFirst(7);
		
		System.out.println(operation);
		
		operation.removeFirst();
		
		System.out.println(operation);
		
		operation.removeLast();
		
		System.out.println(operation);

	}

}
