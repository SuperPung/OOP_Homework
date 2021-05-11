package com.huawei.classroom.student.h05;

/**
 * @author super
 */
public class WarFactory extends Base{
    public WarFactory() {
        super(100, 0);
    }
    public Tank building(EnumObjectType built) {
        if (built == EnumObjectType.mediumTank)
            return new MediumTank();
        else if (built == EnumObjectType.heavyTank)
            return new HeavyTank();
        else
            return null;
    }
}
