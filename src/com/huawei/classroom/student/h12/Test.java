package com.huawei.classroom.student.h12;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testCount = 2;
		String content= "a,b,c,d,e,f;a,e,b,c,g,d,k;s,w,e,d,q,a,c,b;z,l,m,a";
 		Home12 h=new Home12();
		/**
		 * 
		 * 字符串content是一个超市的历次购物小票的合计，每次购物的明细之间用分号分割，每个商品之间用半角逗号分开
		 * 请找出   哪n(n>=1)个商品被同时购买的频率最高，将这n个商品名称的集合（set)返回 
		 * 测试的时候，购物次数<100,每次购买的商品数量<10,1<=n<=10
		 */
		Set<String> result;
		Set<String> right = new HashSet<String>();
		// n=1
		result = h.getFrequentItem(content, 1);
		right.add("a");
		if (result.equals(right)) {
			System.out.println("做对了1");
		} else {
			System.out.println(result);
		}
		// n=2
		result = h.getFrequentItem(content, 2);
		right.add("b");
		if (result.equals(right)) {
			System.out.println("做对了2");
		} else {
			System.out.println(result);
		}
		// n=3
		result = h.getFrequentItem(content, 3);
		right.add("c");
		if (result.equals(right)) {
			System.out.println("做对了3");
		} else {
			System.out.println(result);
		}
		// n=4
		result = h.getFrequentItem(content, 4);
		right.add("d");
		if (result.equals(right)) {
			System.out.println("做对了4");
		} else {
			System.out.println(result);
		}
		// n=5
		result = h.getFrequentItem(content, 5);
		right.add("e");
		if (result.equals(right)) {
			System.out.println("做对了5");
		} else {
			System.out.println(result);
		}

	}
}
