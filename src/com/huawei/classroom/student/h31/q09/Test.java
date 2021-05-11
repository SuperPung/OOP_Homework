/**
 * 
 */
package com.huawei.classroom.student.h31.q09;

/**
 * @author //{da3aedaeb817eb1c04577d7eb2c83e2a}       
 * 
 * 本题目10分，共计11道题
 * 难度系数 1星
 */
public class Test {

	/**
	 * 
	 */
	public Test() {
		// TODO Auto-generated constructor stub //{da75823bd8699aa0cd24f813084c8561} 
	}

	/**
	 * //{dd29a6ff36c38587aff01798c24d1e05}
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub //{dd32b8e49647f0a0986d43c42d4d317d} 
		//在本包下增加合适的类，使得如下代码编译通过并正确运行
		//本题目所有答案必须放在和本Test同级的目录下,除了JDK1.8自带的包以外，不允许引用第三方的包
		//本目录下的程序不要引用其他考题的类，否则会导致编译失败
		//不能随意读写文件，建立网络连接，访问数据库，创建临时文件目录等
		Bird bird=new Bird();
		if(bird.speak().equals("jiujiu")) {
			System.out.println("case 1 pass!");
		}
	}

}
//TODO Auto-generated constructor stub //{df35a246cf10565406d80b3ac07cde80} 