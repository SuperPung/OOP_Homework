package com.huawei.classroom.student.h31.q01;

/**
 * @author  //{47e7e4e11ced03431df01b826e7e4f18}       
 * 
 * 本题目10分，共计11道题
 * 难度系数 1星
 */
public class Test {
	/**
	 * 
	 */
	public Test() {
		// TODO Auto-generated constructor stub //{4b564aa4f9f704c98c4b70992428f6b7}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub //{4fa36e9c99f8ada0d9adb1e12353fc0d}
		// 在本包下增加合适的类或者接口，使得如下代码编译通过并正确运行
		//本题目所有答案必须放在和本Test同级的目录下,除了JDK1.8自带的包以外，不允许引用第三方的包
		//本目录下的程序不要引用其他考题的类，否则会导致编译失败
		//不能随意读写文件，建立网络连接，访问数据库，创建临时文件目录等

		Classq01 util=new Classq01();
		int[] case1= {0,1,2,3};
		//getAvg 返回整数数组中所有元素的平均值  
		if(Math.abs(util.getAvg(case1)-1.5)<0.001) {
			System.out.println("case 1 pass!");
		} 
	}

}
//TODO Auto-generated constructor stub //{4fb7e605438120259990c3b6a4ea8c9b} 
