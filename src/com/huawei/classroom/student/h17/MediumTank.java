package com.huawei.classroom.student.h17;

/**
 * @author super
 */
public class MediumTank extends Tank {

	public MediumTank(Player player, int x, int y) {
		super(player, Param.mediumTankHealth, Param.mediumTankStrength, Param.mediumTankRange, x, y);
		setObjectType(EnumObjectType.mediumTank);
	}

}
