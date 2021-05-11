package com.huawei.classroom.student.h17;


/**
 * @author super
 */
public class GameBase extends GameObject {
    public GameBase(Player player, int x, int y) {
        super(player, Param.baseHealth, Param.baseStrength, Param.baseRange, x, y);
        setObjectType(EnumObjectType.base);
    }

    public Building building(EnumObjectType enumObjectType, int x, int y) {
        if (enumObjectType == EnumObjectType.barrack) {
            return new Barrack(this.getPlayer(), x, y);
        } else if (enumObjectType == EnumObjectType.warFactory) {
            return new WarFactory(this.getPlayer(), x, y);
        } else {
            return null;
        }
    }
}
