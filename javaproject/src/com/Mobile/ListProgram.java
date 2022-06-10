package com.Mobile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ListProgram {

	public static void main(String[] args) {
		
		// ArrayList
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(7);
		list.add(6);
		list.add(0);
		
		System.out.println(list);
		
		list.set(8,8);
		list.set(9, 9);
		list.set(10,10);
		System.out.println(list);
		list.remove(10);
		System.out.println(list);
		
		//LinkedList
		
		List<String> names = new LinkedList<String>();
		
		names.add("Ram");
		names.add("Shyam");
		names.add("Madan");
		names.add("Mohan");
		names.add("Rahul");
		names.add("Priti");
		
		System.out.println(names);
		
		//Vector
		
		List<Float> show = new Vector<Float>();
		
		show.add(1.0f );
		show.add(9.46f );
		show.add(1.465f );
		show.add(28.0f );
		show.add(14.056f );
		
		show.set(1, 3.2f);
		
		
		System.out.println(show);
		
	}

}
