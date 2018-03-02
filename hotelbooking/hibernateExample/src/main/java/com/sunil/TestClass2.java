package com.sunil;

public class TestClass2 {

	public static void main(String[] args) {
		TestClass1 classTest = new Subclass();
		classTest.m1();
	}
}

class TestClass1 {
	public static void m1() {
		System.out.println("TestClass1");

	}

}

class Subclass extends TestClass1 {
	public void m1() {
		System.out.println("Subclass");
	}
}