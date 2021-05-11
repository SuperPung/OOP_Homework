package com.huawei.classroom.student.h03;

import java.math.BigInteger;
import java.util.Arrays;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//isNarcissisticNum 测试用例
		if(!Home03.isNarcissisticNum(3)) {
			System.out.println("isNarcissisticNum 测试用1通过");
		}
		if(Home03.isNarcissisticNum(153)) {
			System.out.println("isNarcissisticNum测试用2通过");
		}
		
		//Perfectnumber 测试用例
		if(Home03.Perfectnumber(6)) {
			System.out.println("Perfectnumber 测试用1通过");
		}
		
		//factorial 测试用例
		if(Home03.factorial(3)==6) {
			System.out.println("factorial 测试用1通过");
		}
		if(Home03.binToDec("10").equals("2") ) {
			System.out.println("binToDec 测试用1通过");
		}
		
		//求解二元一次方程的测试用例 自己想怎么写，方程肯定有两个不同的解，也就是deta>0,解没有顺序要求，那个放在前面都都行
		if (Arrays.equals(Home03.getRoot(1, -2, 1), new double[]{1, 1})) {
			System.out.println("getRoot 测试用1通过");
		}
		
		//getPascalTriangle测试用例自己想想怎么写
		if (Arrays.equals(Home03.getPascalTriangle(5), new int[]{1, 4, 6, 4, 1})) {
			System.out.println("getPascalTriangle 测试用1通过");
		} //else
			// System.out.println(Arrays.toString(Home03.getPascalTriangle(5)));

		//zipSpace 测试用例
		if(Home03.zipSpace("1 2").equals("12") ) {
			System.out.println("zipSpace 测试用1通过");
		}
	}
	 

}
