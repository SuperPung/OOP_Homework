package com.huawei.classroom.student.h05;

/**
 * @author super
 */
public class Dog extends Base {
    public Dog() {
        super(50, 5);
    }

    public void attack(Soldier soldier) {
        if (soldier.lifeValue > 0) {
            soldier.lifeValue = 0;
            Soldier.setDeadedSoldierCount();
        }
    }
}
