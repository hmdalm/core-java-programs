package com.doSome.work;

class ToStringEx {
	String name;
	String lastName;
	int age;
	int rollNo;

	public ToStringEx(String name, String lastName, int age, int rollNo) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.rollNo = rollNo;
	}

	public String getname() {
		return name;
	}

	public String getlastname() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public int getRno() {
		return rollNo;
	}

	public String toString() {
		return ("The Name is : " + name + " " + lastName + " " + "\nMy age & roll no are :" + age + "&" + rollNo);
	}
	public static void main(String[] args) {
		ToStringEx ob = new ToStringEx("hmd", "alm", 29, 181818);
		System.out.println(ob.toString());
	}

}
