package com.sunil;

public class Student18 implements Cloneable {
	int rollno;
	String name;

	Student18(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	 public Object clone() throws CloneNotSupportedException {
	 return super.clone();
	 }

	public static void main(String args[]) {
//		try {
			Student18 s1 = new Student18(101, "amit");

			Student18 s2 = s1;

			if (s1 == s2)
				System.out.println("Equal");
			else
				System.out.println("Not Equal");

			System.out.println(s1.rollno + " " + s1.name);
			System.out.println(s2.rollno + " " + s2.name);

//		} catch (CloneNotSupportedException c) {
//			
//			System.out.println("Exception");
//		}
		

	}
}
