package com.sunil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface A {
	default void M11() {
		System.out.println("Hello");
	}
}

public class test3 implements A {
	public void M11() {
		System.out.println("Hello 3");
	}

	public static void main(String args[]) {

		A a = new test3();
		a.M11();

		// List<String> linked = new ArrayList<>();
		// linked.add("Hello");
		// linked.add("Kumar");
		// linked.add("A");
		// linked.add("B");
		// linked.add("Kuma");
		// linked.add("B");
		//
		// Collections.sort(linked);
		//
		// linked.forEach(System.out::println);
		//
		// linked.forEach(System.out::println);
		//
		// System.out.println(linked);
		//
		// System.out.println("---------------->" + linked.remove("k"));
		// System.out.println(linked);
	}

}
