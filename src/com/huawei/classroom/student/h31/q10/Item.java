package com.huawei.classroom.student.h31.q10;
import java.util.HashMap;

public class Item implements Comparable{
	private String name;
	private int amount;
	private int money;
	
	public Item(String name, int amount, int money) {
		this.name = name;
		this.amount = amount;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public Item(String name, String amount, String money) {
		this(name, Integer.valueOf(amount), Integer.valueOf(money));
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (!(o instanceof Item)) {
            return -1;
        }
		if (this.amount > ((Item) o).amount) {
			return 1;
		} else if (this.amount == ((Item) o).amount) {
			if (this.money > ((Item) o).money) {
				return 1;
			} else if (this.money == ((Item) o).money) {
				return 0;
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}
	public int compareMTo(Object o) {
		// TODO Auto-generated method stub
		if (!(o instanceof Item)) {
            return -1;
        }
		if (this.money > ((Item) o).money) {
			return 1;
		} else if (this.money == ((Item) o).money) {
			if (this.amount > ((Item) o).amount) {
				return 1;
			} else if (this.amount == ((Item) o).amount) {
				return 0;
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}
	
}
