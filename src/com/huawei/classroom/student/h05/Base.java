package com.huawei.classroom.student.h05;

/**
 * @author super
 */
public class Base {
    protected int lifeValue;
    protected int attackPower;

    public Base(int lv, int ap) {
        this.lifeValue = lv;
        this.attackPower = ap;
    }

    public void attack(Soldier soldier) {
        if (soldier.lifeValue > 0) {
            soldier.lifeValue -= this.attackPower;
            if (soldier.lifeValue <= 0)
                Soldier.setDeadedSoldierCount();
        }
    }
    public void attack(Tank tank) {
        if (tank.lifeValue > 0)
            tank.lifeValue -= this.attackPower;
    }
    public void attack (Dog dog) {
        if (dog.lifeValue > 0)
            dog.lifeValue -= this.attackPower;
    }
    public int getHealth() {
        return this.lifeValue;
    }
    public boolean isDestroyed() {
        return this.lifeValue <= 0;
    }
}
