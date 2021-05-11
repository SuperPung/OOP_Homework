package com.huawei.classroom.student.h31.q05;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  //{8fff7efdbb04fd711db4380ae0a2fdbd}       
 * 
 * 本题目10分，共计11道题
 * 难度系数2星
 */
public class Test {
	
	
	public Test() { 
		// TODO Auto-generated constructor stub //{946220e870b89020eaf8639923993172}
	}

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub //{953c1ac228d8d817c4830fe6c127b344}
		// 在本包下增加/完成合适的类或者接口，使得如下代码编译通过并正确运行
		//本题目所有答案必须放在和本Test同级的目录下,除了JDK1.8自带的包以外，不允许引用第三方的包
		//本目录下的程序不要引用其他考题的类，否则会导致编译失败
		//不能随意读给定目录以外的文件，建立网络连接，访问数据库，创建临时文件目录等	
		 
		
		Classq05 util=new Classq05();
		
		/**
		 * 完成findMax函数，找到三个数里面最大的一个数，返回
		 * 
		 */		
		int max= util.findMax(4,6, 5);
		if(max==6) {
			System.out.println("case 1 pass!");
		}
		
	}
}
//TODO Auto-generated constructor stub //{95cb441c40d53ba4748d8cbe6ab160af}