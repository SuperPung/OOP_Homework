package com.huawei.classroom.student.h09;


/**
 * 
 
 * 不要引用jdk1.8以外第三方的包
 * 
 * @author cjy
 *
 */
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 
		// TODO Auto-generated method stub
		//完成Home09的代码 使得下列代码能够编译 并且通过测试用例
		Home09 util=new  Home09();
		if(util.getDistinctCharCount("北京市北京大学")==5) {
			System.out.println("getDistinctCharCount ok");
		}
		if(util.getFrequentChar("我是xx大学软件学院学生")=='学') {
			System.out.println("getFrequentChar ok");
		}
		
		if(util.getFrequentWord("北京市北京大学").equals("北京")) {
			System.out.println("getFrequentWord ok");
		}
		String str = "tjucici";
		System.out.println(str + ":");
		System.out.println(util.getFrequentWord(str));

		StringBuffer buf=new StringBuffer("a b c ");
		util.zipStringBufer(buf);
		if(buf.toString().equals("abc") ) {
			System.out.println("zipStringBufer ok");
		}

		StringBuffer buff=new StringBuffer("   a b c ");
		System.out.println(buff.toString() + ":");
		util.zipStringBufer(buff);
		System.out.println(buff.toString());
	}

}
