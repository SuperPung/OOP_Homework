package com.huawei.classroom.student.h17;


/**
 * @author super
 */
public class RifleSoldier extends Soldier {

	public RifleSoldier(Player player, int x, int y) {
		super(player, Param.rifleSoldierHealth, Param.rifleSoldierStrength, Param.rifleSoldierRange, x, y);
		setObjectType(EnumObjectType.rifleSoldier);
	}

}
