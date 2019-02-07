package com.collections;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedlist {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("single");
		list.add("multilevel");
		list.add("heirarchical");
		list.add("multiple");
		list.add("hybrid");
		Collections.sort(list);
		System.out.println("sorted list: "+list);
		Collections.reverse(list);
		System.out.println("reverse list: "+list);
	}
}
