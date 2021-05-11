package com.huawei.classroom.student.h17;


/**
 * @author super
 */
public class Dog extends GameObject {

	public Dog(Player player, int x, int y) {
		super(player, Param.dogHealth, Param.dogStrength, Param.dogRange, x, y);
		setObjectType(EnumObjectType.dog);
	}

}
