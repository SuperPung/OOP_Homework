
package com.huawei.classroom.student.h13;

import java.io.*;
import java.util.*;

/**
 * 在本包下增加合适的类和方法，使得Test类能够测试通过 
 * 
 * 不要引用jdk1.8以外第三方的包
 * 
 * @author super
 *
 */
public class Analysis {
	private final String[] chapters;
	private final Set<Character> ignoreChar = new HashSet<>(Arrays.asList(' ', '\r', '\t'));

	/**
	 * @throws Exception
	 * 
	 */
	public Analysis(String filename) throws Exception {
		String text = readFromTxt(filename);
		text = text.replaceAll("[\\pP‘’“”]", " ");
		this.chapters = splitContentToChapter(text);
	}

	/**
	 * 提示 ：将一个文本文件读取到一个字符串中返回
	 * 
	 * @param filename 红楼梦文本文件的全路径名
	 * @return 文本的内容
	 */
	private String readFromTxt(String filename) throws Exception {
		Reader reader = null;
		try {
			StringBuffer buf = new StringBuffer();
			char[] chars = new char[1024];
			// InputStream in=new FileInputStream(filename);

			reader = new InputStreamReader(new FileInputStream(filename), "UTF-8");
			int readed = reader.read(chars);
			while (readed != -1) {
				buf.append(chars, 0, readed);
				readed = reader.read(chars);
			}
			return buf.toString();
		} finally {
			close(reader);
		}
	}
	
	/**
	 * 返回红楼梦中出现频率最高的N个次，频率从高到低排列（所谓词就是两个相邻的汉字）
	 * @param n
	 * @return
	 */
	public List<String> getTopNWords(int n){
		int i, j;
		Map<String, Integer> map = new HashMap<>();
		List<Map.Entry<String, Integer>> mapList;
		List<String> ans = new ArrayList<>();
		for (i = 1; i < this.chapters.length; i++){
			String content = this.chapters[i];
			for (j = 0; j < content.length() - 1; j++) {
				String str = content.substring(j, j + 2);
				if (ignoreChar.contains(str.charAt(0)) || ignoreChar.contains(str.charAt(1))) {
					continue;
				}
				int count;
				count = map.getOrDefault(str, 0);
				map.put(str, count + 1);
			}
		}

		mapList = new ArrayList<>(map.entrySet());
		mapList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

		for (i = 0; i < n; i++) {
			ans.add(mapList.get(i).getKey());
		}

		return ans;
	}
	/**
	 * 关闭输入输入流
	 * 
	 * @param inout
	 */
	private void close(Closeable inout) {
		if (inout != null) {
			try {
				inout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * 提示 将红楼梦文本文件拆分为120个章节的方法
	 * 
	 * @param content
	 * @return 返回120个元素的字符串数组
	 */
	private String[] splitContentToChapter(String content) {
		// 提示 使用 content.split(" 第[一,二,三,四,五,六,七,八,九,十,零]{1,5}回 ");正则表达拆分
		// 百度一下正则表达式
		String contents[] = content.split(" 第[一,二,三,四,五,六,七,八,九,十,零]{1,5}回 ");
		return contents;
	}

	 
	/**
	 * 统计红楼梦章节字符串str出现的频率
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public int[] getStringFrequent(String str) throws Exception {
		int[] counts = new int[120];
		if (this.chapters.length > 121) {
			throw new Exception("拆分的章节数量不对");
		}
		int i, j;
		int length = str.length();
		for (i = 1; i < this.chapters.length; i++) {
			int count = 0;
			String content = this.chapters[i];
			for (j = 0; j < content.length() + 1 - length; j++) {
				String contentStr = content.substring(j, j + length);
				if (str.equals(contentStr)) {
					count++;
				}
				counts[i - 1] = count;
			}
		}
		return counts;
	}

}
