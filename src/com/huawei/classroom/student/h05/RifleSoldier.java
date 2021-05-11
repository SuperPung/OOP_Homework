package com.huawei.classroom.student.h05;

/**
 * @author super
 */
public class RifleSoldier extends Soldier{
    public RifleSoldier() {
        super(50, 5);
    }

    public void attack(Dog dog) {
        if (dog.lifeValue > 0)
            dog.lifeValue = 0;
    }
}
