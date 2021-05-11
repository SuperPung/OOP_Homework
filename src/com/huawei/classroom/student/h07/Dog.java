package com.huawei.classroom.student.h07;

/**
 * @author super
 */
public class Dog extends GameObject {

	public Dog() {

		// super( Param.DOG_HEALTH,Param.DOG_STRENGTH);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack(Soldier soldier) {
		if (soldier.isDestroyed()) {
			return;
		}
		int dx = this.getX() - soldier.getX();
		int dy = this.getY() - soldier.getY();
		double dis = Math.pow(dx * dx + dy * dy, 0.5);
		if (this.getRange() < dis) {
			return;
		}
		soldier.setHealth(0);
		if (soldier.getHealth() <= 0) {
			Soldier.livingSoldierCount--;
			Soldier.deadedSoldierCount++;
		}
	}

}
