package com.huawei.classroom.student.h06;

/**
 * @author super
 */
public class WarFactory extends Building {

	public WarFactory(int x, int y) {
		super(Param.WAR_FACTORY_LV, Param.WAR_FACTORY_AP, Param.WAR_FACTORY_AR, x, y);
	}

	public Tank building(EnumObjectType type) {
		 
			if (type == EnumObjectType.mediumTank) {
				return new MediumTank(this.getPosX(), this.getPosY());
			} else if (type == EnumObjectType.heavyTank) {
				return new HeavyTank(this.getPosX(), this.getPosY());
			} 
			return null;
		 
	}
}
