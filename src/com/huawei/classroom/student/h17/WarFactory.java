package com.huawei.classroom.student.h17;

/**
 * @author super
 */
public class WarFactory extends Building {

	public WarFactory(Player player, int x, int y) {
		super(player, Param.warFactoryHealth, Param.warFactoryStrength, Param.warFactoryRange, x, y);
		setObjectType(EnumObjectType.warFactory);
	}

	public Tank building(EnumObjectType type) {
		 
			if (type == EnumObjectType.mediumTank) {
				return new MediumTank(this.getPlayer(), this.getPosX(), this.getPosY());
			} else if (type == EnumObjectType.heavyTank) {
				return new HeavyTank(this.getPlayer(), this.getPosX(), this.getPosY());
			} 
			return null;
		 
	}
}
