package com.huawei.classroom.student.h31.q06;
/**
 * @author  //{a51aca7775a7570724b5a1aabab34eba}    
 * 本题目10分，共计11道题
 * 
 * 难度系数3星
 */
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub//{a5e3d40bcc1dab6b8c69a84dc5fed4bb}  
		// 在本包下增加/完成合适的类或者接口，使得如下代码编译通过并正确运行
		//本题目所有答案必须放在和本Test同级的目录下,除了JDK1.8自带的包以外，不允许引用第三方的包
		//本目录下的程序不要引用其他考题的类，否则会导致编译失败
		//不能随意读给定目录以外的文件，建立网络连接，访问数据库，创建临时文件目录等		

		Classq06 util=new Classq06();
		//递归的计算一个目录子目录下包含的文件数量（不包括目录数量，仅仅包括文件数量）
		
		
		int count=util.recursiveGetFileCount("D:\\eclipse-workstation\\exam\\src\\com\\huawei\\classroom\\student\\h31\\q06\\dir1");
		if(count==7){
			System.out.println("q06case1 pass");
		}
			

	}

}
//TODO Auto-generated method stub//{a8f84fef0fea97fa8594229cf4c67469}  