package com.huawei.classroom.student.h31.q04;

/**
 * 
 * @author //{753619028b1b80357aa26e067bd38095}
 * 
 * 
 */
public class Classq04 {
	// TODO Auto-generated constructor stub //{7712dc0648dd20fa7019ad20edd36f14}
	public Classq04() {
		// TODO Auto-generated constructor stub //{798a7a0053d25dca6ee4247047ed3ec8}
	}

	/**
	 * // TODO Auto-generated constructor stub //{7b6658bc599d812e03e892787076c842} 
	 * 判断某个三角形是不是直角三角形 ,a,b,c 分别为三角形的三个边长
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public boolean isRightTriangle(int a,int b,int c) {
		// TODO Auto-generated constructor stub //{7c47d8969e2fdebcb07153d45f5ab800}
		 // 
		if (a <= 0||b<=0||c<=0) {
			return false;
		}
		boolean b1=(a*a + b*b==c*c);
		boolean b2=(a*a +c*c==b*b);
		boolean b3=(a*a==b*b+c*c);
		return b1 || b2 || b3;
	}
}
// TODO Auto-generated constructor stub //{7deb9f923f73c4220701957db59bdb3a}