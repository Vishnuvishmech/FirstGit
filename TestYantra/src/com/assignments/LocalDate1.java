package com.assignments;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDate1 {

	public static void main(String[] args) 
	{
		LocalDate d = LocalDate.now();
		System.out.println(d);
		Month m = d.getMonth();
		System.out.println(m);
		int y = d.getYear();
		System.out.println(y);
		int day = d.getDayOfMonth();
		System.out.println(day);
		System.out.println(d.plusMonths(1));
		System.out.println(d.plusYears(1));
		System.out.println(d.minusMonths(2));
		System.out.println(d.minusYears(1));
		
		
	}

}
