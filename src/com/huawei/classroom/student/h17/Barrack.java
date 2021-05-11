package com.huawei.classroom.student.h17;

/**
 * @author super
 */
public class Barrack extends Building {

	public Barrack(Player player, int x, int y) {
		super(player, Param.barrackHealth,Param.barrackStrength, Param.barrackRange, x, y);
		setObjectType(EnumObjectType.barrack);
	}

	public GameObject traing(EnumObjectType type) {
		if (type == EnumObjectType.rifleSoldier) {
			return new RifleSoldier(this.getPlayer(), this.getPosX(), this.getPosY());
		}else if (type == EnumObjectType.RPGSoldier) {
			return new RPGSoldier(this.getPlayer(), this.getPosX(), this.getPosY());
		}else if (type == EnumObjectType.dog) {
			return new Dog(this.getPlayer(), this.getPosX(), this.getPosY());
		}
		return null;
	}

}
