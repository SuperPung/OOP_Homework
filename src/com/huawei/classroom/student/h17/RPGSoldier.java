package com.huawei.classroom.student.h17;


/**
 * @author super
 */
public class RPGSoldier extends Soldier {

	public RPGSoldier(Player player, int x, int y) {
		super(player, Param.RPGSoldierHealth, Param.RPGSoldierStrength, Param.RPGSoldierRange, x, y);
		setObjectType(EnumObjectType.RPGSoldier);
	}

}
