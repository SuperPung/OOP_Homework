package com.huawei.classroom.student.h06;

/**
 * @author super
 */
public class Dog extends GameObject {

	public Dog(int x, int y) {
		super(Param.DOG_LV, Param.DOG_AP, Param.DOG_AR, x, y);
	}

	@Override
	public int getAttackPower(GameObject obj) {
		if(obj instanceof Soldier) {
			return 1000;
		}
		return -1;
	}

}
