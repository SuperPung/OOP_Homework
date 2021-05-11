package com.huawei.classroom.student.h31.q10;

//TODO Auto-generated constructor stub //{df567d6b28c1473027f1b65626e2a306}
import java.io.*;
import java.util.*;


/**
 * 
 * @author //{e093f53034597249aeb2bb3922dbc6fc}
 *
 */
public class Classq10 {

	// TODO Auto-generated constructor stub //{e146f00c1b4cb5da08d1a514464b08a9}
	public Classq10() {

		// TODO Auto-generated constructor stub //{e2e085dc342f70c7d7504c461a7349c1}
	}

	/**
	 * // TODO Auto-generated constructor stub //{e4bc77b4d1a1247d00e77d80f2cc8981}
	 * 
	 * @param fileName 存放了销售记录的文件 
	 *  按每种商品累积销售数量从高到低排序，如果出现累积销售数量相同的情况请按每种商品累积销售金额排序由高到低排序
	 * @return 排序好的商品名称
	 */
	public List<String> sortByAmount(String fileName) {
		//		
		//return sort(fileName);
		
		int i;
        List<String> result = new ArrayList<>();
        List<Item> scoreLists = initScoreLists(fileName);
        scoreLists.sort(new ItemComparator(-1));
        for (i = 0; i < scoreLists.size(); i++) {
            result.add(scoreLists.get(i).getName());
        }
        return result;
	}

	/**
	 * // TODO Auto-generated constructor stub //{e4e48157347be4ff3b9823b0222e5fb7}
	 * 
	 * @param fileName 存放了销售记录的文件 
	 *  按每种商品累积销售金额从高到低排序，如果出现累积销售金额相同的情况请按每种商品累积销售数量由高到低排序
	 * @return 排序好的商品名称
	 */
	public List<String> sortByMoney(String fileName) {
		int i;
        List<String> result = new ArrayList<>();
        List<Item> scoreLists = initScoreLists(fileName);
        scoreLists.sort(new ItemComparator(1));
        for (i = 0; i < scoreLists.size(); i++) {
            result.add(scoreLists.get(i).getName());
        }
        return result;
	}

	public List<Item> initScoreLists(String filename) {
        int i, j;
        List<String[]> items = readLines(filename);
        Set<String> nameSet = new HashSet<>();
        List<Item> itemList = new ArrayList<>();
        for (i = 0; i < items.size(); i++) {
            String name = "";
            int money = 0, amount = 0;
            List<String> itemLine = new ArrayList<>(Arrays.asList("", "0", "0"));
            line2list(items.get(i), itemLine);
            name = itemLine.get(0);
            if (nameSet.contains(name)) {
                continue;
            } else {
                nameSet.add(name);
            }
            money += Integer.parseInt(itemLine.get(2));
            amount += Integer.parseInt(itemLine.get(1));
            for (j = i + 1; j < items.size(); j++) {
                if (items.get(j)[0].equals(name)) {
                    line2list(items.get(j), itemLine);
                    money += Integer.parseInt(itemLine.get(2));
                    amount += Integer.parseInt(itemLine.get(1));
                }
            }

            Item item = new Item(name, amount, money);
            itemList.add(item);
        }
        return itemList;
    }

    public List<String> sort(String filename){
        int i;
        List<String> result = new ArrayList<>();
        List<Item> scoreLists = initScoreLists(filename);
        scoreLists.sort(new ItemComparator(-1));
        for (i = 0; i < scoreLists.size(); i++) {
            result.add(scoreLists.get(i).getName());
        }
        return result;
    }
    private static List<String[]> readLines(String filename) {
        String line = "";
        Reader reader = null;
        List<String[]> result = new ArrayList<>();
        try {
            reader = new FileReader(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (reader == null) {
            return null;
        }
        LineNumberReader lineReader = new LineNumberReader(reader);

        try {
            while (true) {
                line = lineReader.readLine();
                if (line == null) {
                    break;
                }
                if ("".equals(line) || line.charAt(0) == '#' || line.trim().length() == 0) {
                    continue;
                }
                result.add(line.replace(" ", "").split(","));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * @param scoreLine 一行文本
     * @return 0 姓名 1 语文 2 数学 3 英语 4 当前成绩
     */
    public void line2list(String[] itemLine, List<String> itemList) {
        String name = itemLine[0];
        String amount = itemLine[1];
        String money = itemLine[2];
        itemList.set(0, name);
        itemList.set(1, amount);
        itemList.set(2, money);
    }
}