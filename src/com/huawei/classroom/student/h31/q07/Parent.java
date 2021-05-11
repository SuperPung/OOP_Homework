package com.huawei.classroom.student.h31.q07;

/**
 * 
 *  @author //{aeb12c7c36cdbf601e4861e680597b08}  
 *
 */
public class Parent {
	// TODO Auto-generated constructor stub //{aee76bb08b8758d0a0bfc0b9b2919bc4}
	private String name;
	private String address;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Parent(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	public Parent() {
		this("no_name","no_address",-1);
	}
	 
	 

}
//TODO Auto-generated constructor stub //{af25a68c246362fc47a1d73c2a4f147c}