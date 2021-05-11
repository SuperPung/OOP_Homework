/**
 * 
 */
package com.huawei.classroom.student.h31.q02;

import java.util.ArrayList;
import java.util.List;
/**
 * @author  //{5fa2ff6c9589ed308d97aa492b63b4b9}       
 * 
 * 本题目10分，共计11道题
 * 难度系数2星
 */
public class Test {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub //{6318fa79c5dcc9bdb288bcaf3fb7b627}
		// 在本包下增加/完成合适的类或者接口，使得如下代码编译通过并正确运行
		//本题目所有答案必须放在和本Test同级的目录下,除了JDK1.8自带的包以外，不允许引用第三方的包
		//本目录下的程序不要引用其他考题的类，否则会导致编译失败

		Classq02 util=new Classq02();
		List<String> list=new ArrayList<String>();
		list.add("~!@@@@@");//包含了3个不同特殊字符
		list.add("@#$%K");//包含了4个不同特殊字符
		list.add("abcAB");//包含了0个不同特殊字符
		list.add("123456A@#");//包含了 2个不特殊同字符
		//list中每个元素存了一个字符串，请返回包含不同特殊字符 最多的字符串,所谓特殊字符在本题目中定义为如下9个字符：(~!@#$%^&*) 不包括括号, 不会出现并列的情况 
		String maxStr=util.findMaxDistinctCharWord(list) ;
		System.out.println(maxStr);
		if("@#$%K".equalsIgnoreCase(maxStr)) {
			System.out.println("case 1 pass!");
		}
		 
	}

}
//TODO Auto-generated method stub