package com.Mobile;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueProgram {

	public static void main(String[] args) {
		Queue<Integer> myqueue = new PriorityQueue<>();
		
		//InQueue
		
		myqueue.add(34);
		myqueue.add(48);
		myqueue.add(586);
		myqueue.add(39);
		myqueue.add(68);
		myqueue.add(59);
		myqueue.add(35);
		myqueue.add(498);
		myqueue.add(34);
		
		System.out.println(myqueue);
		
		//Dequeue
		myqueue.remove();
		System.out.println(myqueue);
		myqueue.remove();
		System.out.println(myqueue);
		
		myqueue.offer(100);
		System.out.println(myqueue);
	}

}
