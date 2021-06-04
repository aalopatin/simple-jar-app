package com.company.utils;

import com.company.utils.greet.Greetings;
import com.company.utils.count.Counter;

public class Printer {
	public static void print(String[] args) {
		for(String arg: args) {
			System.out.println(Greetings.greet(arg));
		}
		
		System.out.println(Counter.count(args));
		
	}
}