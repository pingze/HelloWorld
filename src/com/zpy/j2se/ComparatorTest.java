package com.zpy.j2se;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		Person p1 = new Person("zhangsan", 25);
		Person p2 = new Person("lisi", 22);
		List<Person> list = Arrays.asList(p1, p2, new Person("wangermazi", 27));
		//System.out.println(list);
		list.forEach(System.out::println);
		Collections.sort(list, (o1, o2) -> {
			return o2.getAge() - o1.getAge();
		});
		//System.out.println(list);
		list.forEach(n -> System.out.println(n));
	}
}
