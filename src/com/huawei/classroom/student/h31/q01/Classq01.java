package com.huawei.classroom.student.h31.q01;

/**
 * @author //{3d42232630b5717f8a0f35068e26bbde}
 * 
 *         本题目10分，共计11道题
 */
public class Classq01 {

	public Classq01() {
		// TODO Auto-generated constructor stub //{3dc40fda7f483c01f5ecde2c742b7cdf}
	}

	/**
	 * 返回整数数组中的平均值 //{4415cedd7261f59e337c2cb255b1e52c}
	 * 
	 * @param a
	 * @return
	 */
	public double getAvg(int[] a) {
		// TODO Auto-generated constructor stub //{46bc386cfa75e0ec01810c2930068aa1}
		double sum = 0;
		int count = a.length;
		for (int ele :a) {
			sum += ele;
		}
		return sum / (double)count;
	}

}
// TODO Auto-generated constructor stub //{47550f752b4341ab04e8c20b66945b5e}