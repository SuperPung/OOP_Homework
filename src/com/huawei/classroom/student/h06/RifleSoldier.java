package com.huawei.classroom.student.h06;

/**
 * @author super
 */
public class RifleSoldier extends Soldier {

	public RifleSoldier(int x, int y) {
		super(Param.SOLDIER_LV, Param.SOLDIER_RIFLE_AP, Param.SOLDIER_RIFLE_AR, x, y);
	}

	@Override
	public int getAttackPower(GameObject obj) {
		if(obj instanceof Dog) {
			return 1000;
		}
		return -1;
	}

}
