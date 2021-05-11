package com.huawei.classroom.student.h31.q07;

public class Classq07 extends Parent{
	public Classq07() {
		super();
	}
	public Classq07(String name, String address) {
		super(name, address, -1);
	}
	public Classq07(int age) {
		super("no_name", "no_address", 20);
	}
	public Classq07(String name, String address, int age) {
		super(name, address, age);
	}
	
}
