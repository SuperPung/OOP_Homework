package com.huawei.classroom.student.h07;

/**
 * @author super
 */
public abstract class Soldier extends GameObject {

	public static int livingSoldierCount = 0;
	public static int deadedSoldierCount = 0;

	public Soldier() {

		livingSoldierCount++;
		// TODO Auto-generated constructor stub
	}

	public static int getLivingSoldierCount() {
		return livingSoldierCount;
	}

	public static int getDeadedSoldierCount() {
		return deadedSoldierCount;
	}

}
