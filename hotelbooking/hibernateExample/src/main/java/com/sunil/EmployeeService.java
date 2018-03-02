package com.sunil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeService {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Sunil", "Kumar"));
		list.add(new Employee("Anil", "Josh"));
		Collections.sort(list);
		list.forEach(l -> System.out.println(l.fname + " " + l.lName));

	}

}

// class Employee implements Comparator<Employee> {
//
// String fname;
// String lName;
//
// public Employee(String fname, String lname) {
// this.fname = fname;
// this.lName = lname;
// // TODO Auto-generated constructor stub
// }
//
// @Override
// public int compare(Employee arg0, Employee arg1) {
// return arg0.fname.compareTo(arg1.fname);
// }
//
// }

class Employee implements Comparable<Employee> {

	String fname;
	String lName;

	public Employee(String fname, String lname) {
		this.fname = fname;
		this.lName = lname;
		// TODO Auto-generated constructor stub
	}

	// @Override
	// public int compare(Employee arg0, Employee arg1) {
	// return arg0.fname.compareTo(arg1.fname);
	// }

	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		return this.fname.compareTo(arg0.fname);
	}

}