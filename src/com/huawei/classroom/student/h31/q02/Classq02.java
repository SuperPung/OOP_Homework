package com.huawei.classroom.student.h31.q02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author //{53a0f857cc45d23429b16584b7679596}
 *
 */
public class Classq02 {
	private Set<Character> charSet = new HashSet<>(Arrays.asList('~', '!', '@', '#', '$', '%', '^', '&', '*'));
	/**
	 * list中每个元素存了一个字符串，请返回包含不同特殊字符 最多的字符串,所谓特殊字符在本题目中定义为如下9个字符：(~!@#$%^&*) 不包括括号, 不会出现并列的情况 
	 * //{5520e78cf3d94babf9c133f987d1efc5}
	 * 
	 * @param list
	 * @return
	 */
	public String findMaxDistinctCharWord(List<String> list) {
		// TODO Auto-generated constructor stub //{5568b3029731bc397833a95b7c64a409}
		int i, max;
		String ans = new String();
		Map<String, Integer> map = new HashMap<>();
		for (i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if (!map.containsKey(str)) {
				map.put(str, getDistinctCharCount(str));
			}
		}
		max = 0;
		Set<String> stringSet = map.keySet();
		for (String str: stringSet) {
			if (max < map.get(str)) {
				max = map.get(str);
				ans = str;
			}
		}
		return ans;
	}
	
	public int getDistinctCharCount(String s) {
		Set<Character> set = new HashSet<>();
		char[] chars = s.toCharArray();
		for (char cha : chars) {
			if (charSet.contains(cha)) {
				set.add(cha);
			}
		}
		return set.size();
	}

	// 
}
// TODO Auto-generated constructor stub //{5f2971bf44fb08cd15bf881a1e342fca}