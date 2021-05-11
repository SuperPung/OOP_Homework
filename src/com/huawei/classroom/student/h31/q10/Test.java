/**
 * 
 */
package com.huawei.classroom.student.h31.q10;

import java.util.Arrays;
import java.util.List;
 

/**
 * @author  //{ee1a4b8a125f8ee216a8dd9ee016114f}       
 * 
 * 本题目6分，共计11道题
 * 难度系数4星
 */
public class Test {
 
	public Test() { 
		// TODO Auto-generated constructor stub //{f64caea0294036e17bfef7ec57f46934}
	}
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub //{f8f532010770aa1d32b535cc15ab2875}
		// 在本包下增加/完成合适的类或者接口，使得如下代码编译通过并正确运行
		//本题目所有答案必须放在和本Test同级的目录下,除了JDK1.8自带的包以外，不允许引用第三方的包
		//本目录下的程序不要引用其他考题的类，否则会导致编译失败

		//String fileName = "此处设置一个合适的目录让你测试的时候可以访问\\records.txt";
		String fileName = "D:\\eclipse-workstation\\exam\\src\\com\\huawei\\classroom\\student\\h31\\q10\\records.txt";
		
		Classq10 util = new Classq10();		 
		/**
		 * fileName文件中以  “商品名称,数量,总金额” 格式存放了若干购物流水 文件中可能有空行 也可能有 注释行（#开头） 商品名称 数量 总金额 前后可能有空格
		 * 请完成sortByAmount方法 按每种商品累积销售数量从高到低排序，如果出现累积销售数量相同的情况请按每种商品累积销售金额排序由高到低排序 
		 * 请完成sortByMoney方法 按每种商品累积销售金额从高到低排序，如果出现累积销售金额相同的情况请按每种商品累积销售数量由高到低排序 
		 */
		List<String>  list = util.sortByMoney(fileName);
		System.out.println(list);
		List<String> result=Arrays.asList("apple","water","beer","bread");
		if(result.equals(list)) {
			System.out.println("case 1 pass ");
		};
		list = util.sortByAmount(fileName);
		result=Arrays.asList("water","apple","beer","bread");
		if(result.equals(list)) {
			System.out.println("case 2 pass ");
		};
 	}


}
//TODO Auto-generated method stub //{fc5c32c83153ed905eafe50a89fe1ce3}