/**
 * 
 */
package com.huawei.classroom.student.h31.q11;

/**
 * @author  //{190b78dbf457fbcc6aa1678ff415c650}       
 * 
 * 本题目4分，共计11道题
 * 难度系数10星
 * 此题难度较高，请务必确保其他题目已经正确完成以后再做此题目
 */
public class Test {
	public Test() { 
		// TODO Auto-generated constructor stub //{1b68afd2a42ad4cfc19f67defe88a81b}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub //{1b76513f91ee79a76bc255d378a2ccbd}
		// 在本包下增加/完成合适的类或者接口，使得如下代码编译通过并正确运行
		//本题目所有答案必须放在和本Test同级的目录下,除了JDK1.8自带的包以外，不允许引用第三方的包
		//本目录下的程序不要引用其他考题的类，否则会导致编译失败
		//此题难度较高，请务必确保其他题目已经正确完成以后再做此题目
		Classq11 util = new Classq11();
		
		//第一问  完成Classq11.extractComment(String line)方法，具体要求见 Classq11.extractComment(String line)
		String line="String str=\"he;/*test*/\";";
		//这行的Java代码对应如下：
		//String str="he;/*test*/";
		if("".equals(util.extractComment(line))) {
			System.out.println("case 2 pass");
		}
		

		line="String str=\"he//\";//hi;";
		//这行的Java代码对应如下：
		//String str="he//";//hi;
		if("hi;".equals(util.extractComment(line))) {
			System.out.println("case 3 pass");
		}
		
		//此题难度较高，请务必确保其他题目已经正确完成以后再做此题目
		//第二问 导数表达式和导数值的计算  
		//fx是只包含有一个自变量 x 是表达式，表达式中仅仅包含 加(+)、减(-)、乘(*)、除(/)、乘方(^ 且指数中不包含变量)，请写一个函数计算fx的导数
		//例如：(x-8)^2/(x-2)
		// x^3+x^2+1
		// 6/(x+1)+7/(x+8)
		String fx = "x^2+6";
		//第二问 1  请计算这个函数的导数表达式，表达式不唯一，例如 x+1 或者 1+x 或者 1 + x 都可以。
		String dxe = util.getDxExp(fx);
		//第二问 2  请计算这个函数在指定x值的导数值并返回
		double x=0;
		double dxv=util.getDxValue(fx,x);
		//注意不能使用简单的((f(x+deta)-f(x))/deta)来计算，这样做的精度无法达标
		//只有导数表达式和导数值完全符合要的，才算测试用例通过，仅仅计算出导数值或者表达式，不算通过
		if (("2*x".equals(dxe))&&(Math.abs(dxv-0)<1e-20)) {
			//实际测试的时候，如果导数值计算正确，阅卷老师会人工判断导数表达式是否正确
			System.out.println("case 4 pass!");
		}
	}

}
//TODO Auto-generated constructor stub //{1df4e6b72e3648b478d2b65d8df086f1}