package com.huawei.classroom.student.h06;

/**
 * @author super
 */
public abstract class GameObject {

	private int lifeValue = 0;
	private final int attackPower;
	private final double attackRange;
	private int x, y;

	public GameObject(int lv, int ap, double ar, int x, int y) {
		this.lifeValue = lv;
		this.attackPower = ap;
		this.attackRange = ar;
		this.x = x;
		this.y = y;
	}

	public void changeHealth(int strength) {
		if (this.isDestroyed()) {
			return;
		}
		this.lifeValue -= strength;
		if (this.lifeValue <= 0) {
			this.dead();
		}
	}

	public void dead() {

	}

	public int getHealth() {
		return lifeValue;
	}

	public int getPosX() {
		return this.x;
	}

	public int getPosY() {
		return this.y;
	}

	public double getDistance(GameObject obj) {
		return Math.sqrt(Math.pow(this.x - obj.x, 2) + Math.pow(this.y - obj.y, 2));
	}

	public void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	public void attack(GameObject obj) {
		if (obj.isDestroyed()) {
			return;
		}
		int ap = getAttackPower(obj);
		if (ap < 0) {
			ap = this.attackPower;
		}
		if (this.attackRange >= this.getDistance(obj)) {
			obj.changeHealth(ap);
		}
	}

	public boolean isDestroyed() {
		return lifeValue <= 0;
	}

	public int getAttackPower(GameObject obj) {
		return -1;
	}
}
