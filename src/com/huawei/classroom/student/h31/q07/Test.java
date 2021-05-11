package com.huawei.classroom.student.h31.q07;

/**
 * @author  //{b652bfcd48729bcfd7bd9eab261ceb5f}       
 * 
 * 本题目10分，共计11道题
 * 难度系数2星
 */
public class Test {
	public Test() { 
		// TODO Auto-generated constructor stub //{b844789ffba294e965e18f6e40ba179b}
	}
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub //{ba4c9ff3621a67b8246702a80143c0a0}
		// 在本包下增加/完成合适的类或者接口，使得如下代码编译通过并正确运行
		//本题目所有答案必须放在和本Test同级的目录下,除了JDK1.8自带的包以外，不允许引用第三方的包
		//本目录下的程序不要引用其他考题的类，否则会导致编译失败
		//不能随意读写文件，建立网络连接，访问数据库，创建临时文件目录等		
		//不能修改Parent类中的任何代码
		Parent p=new Classq07();
		if(p.getName().equals("no_name")&&p.getAddress().equals("no_address")&&p.getAge()==-1) {
			System.out.println("case 1 pass");
		}
		
		p=new Classq07("zhang","tianjin");
		if(p.getName().equals("zhang")&&p.getAddress().equals("tianjin")&&p.getAge()==-1) {
			System.out.println("case 2 pass");
		}
		
		p=new Classq07(20);
		if(p.getName().equals("no_name")&&p.getAddress().equals("no_address")&&p.getAge()==20) {
			System.out.println("case 3 pass");
		}
		
		p=new Classq07("li","beijing",18);
		if(p.getName().equals("li")&&p.getAddress().equals("beijing")&&p.getAge()==18) {
			System.out.println("case 4 pass");
		}
		p=new Classq07("s2","c2",9);	
		System.out.println("case 4 pass");
	}

}
//TODO Auto-generated method stub