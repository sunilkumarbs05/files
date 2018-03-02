package com.sunil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Emplyee implements Comparable<Emplyee>, Comparator<Emplyee> {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Emplyee [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emplyee other = (Emplyee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

	public Emplyee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Emplyee() {
	}

	@Override
	public int compare(Emplyee e1, Emplyee e2) {
		return e1.getAge() - e2.getAge();
	}

	@Override
	public int compareTo(Emplyee e) {
		return this.getName().compareTo(e.getName());
	}

	public static void main(String[] args) {
		List<Emplyee> list = new ArrayList<>();
		list.add(new Emplyee("Shushil", 22));
		list.add(new Emplyee("Shushi", 21));
		list.add(new Emplyee("Shus", 25));
		list.add(new Emplyee("Amit", 25));
		list.add(new Emplyee("Ami", 24));
		
		Collections.sort(list);
		
		
		list.forEach(System.out::println);
		System.out.println("------------------------------------");
		Collections.sort(list, new Emplyee());
		list.forEach(System.out::println);
	}
}
