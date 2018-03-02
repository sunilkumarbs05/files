package com.sunil;

import java.util.LinkedList;

public class ReverseArrayListInPlace {
	public static void main(String args[]) {
		LinkedList<String> listOfFood = new LinkedList<>();
		listOfFood.add("Beans");
		listOfFood.add("Soup");
		listOfFood.add("Dark Chocolate");
		listOfFood.add("Yogurt");
		listOfFood.add("Sausage");
		listOfFood.add("Pure Vegetables");
		listOfFood.add("Nuts");
		System.out.println("Original ArrayList: " + listOfFood);
		
		String str = "jhjh";
		System.out.println("----------->"+str.charAt(0));
		
		
		System.out.println("Index -------------"+listOfFood.get(1));
		int size = listOfFood.size();
		for (int i = 0; i < size / 2; i++) {
			final String food = listOfFood.get(i);
			listOfFood.set(i, listOfFood.get(size - i - 1));
			listOfFood.set(size - i - 1, food);
		}
		System.out.println("Reversed ArrayList: " + listOfFood);
	}
}
