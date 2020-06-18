package javaproblems;

import java.util.LinkedList;

public class Linkedlist {

	static void midNode(LinkedList list) {
		int length = list.size()-1;
		int mid = length/2;
		
		System.out.println(list.get(mid));
		
	}
	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(23);
		list.add(5);
		midNode(list);
	}

}
