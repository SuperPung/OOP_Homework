package com.huawei.classroom.student.h17;

/**
 * @author super
 */
public class HeavyTank extends Tank {

	public HeavyTank(Player player, int x, int y) {
		super(player, Param.heavyTankHealth, Param.heavyTankStrength, Param.heavyTankRange, x, y);
		setObjectType(EnumObjectType.heavyTank);
	}


}
