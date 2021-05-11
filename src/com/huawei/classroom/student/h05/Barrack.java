package com.huawei.classroom.student.h05;

/**
 * @author super
 */
public class Barrack extends Base{
    public Barrack() {
        super(100, 0);
    }


    public Base traing(EnumObjectType trained) {
        if (trained == EnumObjectType.rifleSoldier)
            return new RifleSoldier();
        else if (trained == EnumObjectType.RPGSoldier)
            return new RPGSoldier();
        else if (trained == EnumObjectType.dog)
            return new Dog();
        else
            return null;
    }
}
