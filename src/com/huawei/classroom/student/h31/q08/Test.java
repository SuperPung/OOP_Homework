package com.huawei.classroom.student.h31.q08;

/**
 * @author  //{c5690891bca99aa050dc9ea4ee4ebcea}       
 * 
 * 本题目10分，共计11道题
 * 难度系数 1星
 */
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub //{c77debb060f061caaeb0ef80eb4a8524}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub //{d19dfb1aca6661a4218661441ee02695}
		//在本包下增加合适的类或者接口，使得如下代码编译通过并正确运行
		//本题目所有答案必须放在和本Test同级的目录下,除了JDK1.8自带的包以外，不允许引用第三方的包
		//本目录下的程序不要引用其他考题的类，否则会导致编译失败
		//不能随意读写文件，建立网络连接，访问数据库，创建临时文件目录等		
		Person p=new Student("tom");
		if("tom".equals(p.getName())){
			System.out.println("case 1 pass!");
		}
		p.setName("li");
		if("li".equals(p.getName())){
			System.out.println("case 2 pass!");
		}
		
	}

}
//TODO Auto-generated constructor stub //{d3c9a76a3c07b22c7502d3d7dc06c6f4} 