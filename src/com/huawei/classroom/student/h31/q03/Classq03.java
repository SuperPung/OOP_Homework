package com.huawei.classroom.student.h31.q03;

/**
 * @author //{6682efcee463eda27652984baf21fbe1}
 * 
 */
public class Classq03 {

	public Classq03() {
		// TODO Auto-generated constructor stub //{688723eb100d40a403227b2f905866b9}
	}

	/**
	 * //{6accb7293055876abd3d4a0df9acf0e3} 十进制数变为二进制字符串
	 * 
	 * @param i 十进制数
	 * @return 转换后的二进制字符串
	 */
	public String decToBin(int i) {
		int dec= i;
		if (dec < 0)
			i = -i;
		// TODO Auto-generated constructor stub //{6e4f16d1084a4d6d088efa56c403a147}
		// 
		StringBuffer bin = new StringBuffer();
		int chu, yu;
		while (true) {
			chu = i / 2;
			yu = i % 2;
			bin.append(String.valueOf(yu));
			i = i / 2;
			if (chu == 0) {
				break;
			}
		}
		if (dec < 0)
			bin.append("-");
		bin.reverse();
		return bin.toString();
	}
}
// TODO Auto-generated constructor stub //{6eb4d1eabc36a3790435370eeac76c7c}