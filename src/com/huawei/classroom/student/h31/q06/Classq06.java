package com.huawei.classroom.student.h31.q06;

import java.io.File;

/**
 * // TODO Auto-generated constructor stub //{976f80128dcc5dfbbd46f3311b4b77db}
 * @author Administrator
 *
 */
public class Classq06 {
	private int count = 0;
	public Classq06() {
		// TODO Auto-generated constructor stub //{9dcfd7e81bc454ed11a53ec20471bbce}
	}
	
	/**
	 * 递归的计算一个目录子目录下包含的文件数量（不包括目录数量，仅仅包括文件数量）
	 * @param homeDir 
	 * @return the files count 
	 */
	public int recursiveGetFileCount(String homeDir) {
		// TODO Auto-generated constructor stub //{9dddf83460d8a52f11bd280b4dc14fc3}
		 // 
		File dir=new File(homeDir);
		ListFiles(dir);
		return count;
	}
	public void ListFiles(File dir) {
		if (!dir.exists() || !dir.isDirectory()) {
			return;
		}

		String[] files = dir.list();
		for (int i = 0; i < files.length; i++) {
			File file = new File(dir, files[i]);
			if (file.isFile()) {
				count++;
			} else {		
				ListFiles(file); // 对于子目录,进行递归调用
			}
		}

	}
	 //

}

//TODO Auto-generated constructor stub //{a050875a93dbb1ca6e9933be2b18dbc3}