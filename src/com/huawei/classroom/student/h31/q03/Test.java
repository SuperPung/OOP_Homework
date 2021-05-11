package com.huawei.classroom.student.h31.q03;

/**
 * @author //{6ee0579bcc710a73721505496850e16c}
 * 
 *本题目10分，共计11道题
 *难度系数 1星
 */
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub //{726ceca137af0545a67f4669316190e3}
	}

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub //{7430239da23bcd5cb3503c2750db02f2}
		// 在本包下增加/完成合适的类或者接口，使得如下代码编译通过并正确运行
		//本题目所有答案必须放在和本Test同级的目录下,除了JDK1.8自带的包以外，不允许引用第三方的包
		//本目录下的程序不要引用其他考题的类，否则会导致编译失败
		//不能随意读写文件，建立网络连接，访问数据库，创建临时文件目录等		
		Classq03 util = new Classq03();
		//System.out.println(util.decToBin(0));
		if ("-10".equals(util.decToBin(-2))) {
			System.out.println("case 1 pass");
		}

		if ("101".equals(util.decToBin(5))) {
			System.out.println("case 2 pass");
		}

	}

}
// TODO Auto-generated constructor stub //{74879188bdc4baed2599f9d32c9d5dd8}