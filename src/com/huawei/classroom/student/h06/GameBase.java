package com.huawei.classroom.student.h06;

/**
 * @author super
 */
public class GameBase extends GameObject{
    public GameBase(int x, int y) {
        super(Param.BASE_LV, Param.BASE_AP, Param.BASE_AR, x, y);
    }
    public static GameBase createGameBase(int x, int y) {
        return new GameBase(x, y);
    }
    public Building building(EnumObjectType enumObjectType, int x, int y) {
        if (enumObjectType == EnumObjectType.barrack) {
            return new Barrack(x, y);
        } else if (enumObjectType == EnumObjectType.warFactory) {
            return new WarFactory(x, y);
        } else {
            return null;
        }
    }
}
