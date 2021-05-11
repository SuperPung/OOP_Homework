package com.huawei.classroom.student.h06;

/**
 * @author super
 */
public class Barrack extends Building {

	public Barrack(int x, int y) {
		super( Param.BARRACK_LV,Param.BARRACK_AP, Param.BARRACK_AR, x, y);
	}

	public GameObject traing(EnumObjectType type) {
		if (type == EnumObjectType.rifleSoldier) {
			return new RifleSoldier(this.getPosX(), this.getPosY());
		}else if (type == EnumObjectType.RPGSoldier) {
			return new RPGSoldier(this.getPosX(), this.getPosY());
		}else if (type == EnumObjectType.dog) {
			return new Dog(this.getPosX(), this.getPosY());
		}
		return null;
	}

}
