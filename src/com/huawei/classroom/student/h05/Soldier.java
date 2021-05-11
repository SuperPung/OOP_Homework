package com.huawei.classroom.student.h05;

/**
 * @author super
 */
public class Soldier extends Base{
    private static int livingSoldierCount;
    private static int deadSoldierCount;

    public Soldier(int lv, int ap) {
        super(lv, ap);
        setLivingSoldierCount();
    }

    public static int getLivingSoldierCount() {
        return livingSoldierCount;
    }
    public static void setLivingSoldierCount() {
        livingSoldierCount++;
    }
    public static int getDeadedSoldierCount() {
        return deadSoldierCount;
    }
    public static void setDeadedSoldierCount() {
        deadSoldierCount++;
        livingSoldierCount--;
    }

}
