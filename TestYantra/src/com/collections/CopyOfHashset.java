package com.collections;

import java.util.HashSet;

public class CopyOfHashset {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		hset.add("overloading");
		hset.add("overriding");
		hset.add("derivedcasting");
		hset.add("is-a relation");
		HashSet<String> hset1 = new HashSet<>();
		System.out.println(hset1);
		hset1.addAll(hset);
		System.out.println(hset1);

	}

}
