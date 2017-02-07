package com.zpy.j2se;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		List<String> languages = Arrays.asList("Java", "Scala", "C++", "Lisp");
		filter(languages, str -> str.startsWith("J"));
		filter(languages, str -> str.length() > 4);
		filter(languages, str -> true);
	}
	
	public static void filter1(List<String> names, Predicate<String> p) {
		names.forEach(name -> {
			if(p.test(name)) {
				System.out.println(name + " ");
			}
		});
	}
	
	public static void filter(List<String> names, Predicate<String> p) {
		names.stream().filter(str -> (p.test(str))).forEach(name -> System.out.println(name));
	}
}
