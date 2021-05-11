package com.huawei.classroom.student.h11;

import java.util.*;

/**
 * @author super
 */
public class Home11 {

	public Home11() {
		// TODO Auto-generated constructor stub
	}

 
	/**
	 * 字符串content是一个超市的历次购物小票的合计，每次购物的明细之间用分号分割，每个商品之间用半角逗号分开
	 * 请找出   哪两个商品被同时购买的频率最高，将这2个商品名称返回，名称之间用逗号分隔
	 * 测试的时候，商品名称可能增加新的商品，例如方便面、面包...
	 * @param content 历次购物的明细，例如：炸鸡,可乐,啤酒;薯片,啤酒,炸鸡;啤酒,雪碧,炸鸡
	 * @return 哪两个商品被同时购买的频率最高，将这2个商品名称返回，名称之间用逗号分隔
	 */
	public String getFrequentItem(String content)  {
		int i, j, k, max;
		String[] shopping;
		String[] items;
		Set<String> doubleItemsAns;
		Map<Set<String>, Integer> doubleItemsMap;
		Set<Set<String>> doubleItemsSet;
		String ans;

		shopping = content.split(";");
		doubleItemsMap = new HashMap<>();
		for (i = 0; i < shopping.length; i++) {
			items = shopping[i].split(",");
			for (j = 0; j < items.length - 1; j++) {
				for (k = 1; k < items.length; k++) {
					if (items[j].equals(items[k])) {
						continue;
					}
					Set<String> doubleItems = new HashSet<>(2);
					doubleItems.add(items[j]);
					doubleItems.add(items[k]);
					if (!doubleItemsMap.containsKey(doubleItems)) {
						doubleItemsMap.put(doubleItems, 1);
					} else {
						doubleItemsMap.put(doubleItems, doubleItemsMap.get(doubleItems) + 1);
					}
				}
			}
		}

		max = 0;
		doubleItemsAns = new HashSet<>(2);
		doubleItemsSet = doubleItemsMap.keySet();
		for (Set<String> doubleItem: doubleItemsSet) {
			if (max < doubleItemsMap.get(doubleItem)) {
				max = doubleItemsMap.get(doubleItem);
				doubleItemsAns = doubleItem;
			}
		}

		items = doubleItemsAns.toArray(new String[0]);
		ans = items[0] + "," + items[1];
		return ans;
	}

 
}
