package com.huawei.classroom.student.h17;

import java.util.ArrayList;
import java.util.List;

/**
 * @author super
 */
public abstract class GameObject {

	private int lifeValue;
	private final int attackPower;
	private final double attackRange;
	private int x, y;
	private final Player player;
	private static List<GameObject> gameObjects = new ArrayList<>();
	private EnumObjectType objectType; // need

	public GameObject(Player player, int lv, int ap, double ar, int x, int y) {
		this.player = player;
		this.lifeValue = lv;
		this.attackPower = ap;
		this.attackRange = ar;
		this.x = x;
		this.y = y;
		GameObject.gameObjects.add(this);
	}

	// need
	@Override
	public String toString() {
		return "["+player.getName() + "." + objectType +" live=" + (!isDestroyed()) + " x=" + x + " y=" + y+ " health=" + lifeValue+"]";
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

	public void setObjectType(EnumObjectType type) {
		this.objectType = type;
	}

	public Player getPlayer() {
		return this.player;
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
		if (obj.isDestroyed() || this.isDestroyed()) {
			return;
		}
		if (this.attackRange >= this.getDistance(obj)) {
			String debug=this+" 攻击 "+obj;// need
			obj.changeHealth(this.attackPower);
			debug=debug+" 攻击后 health="+obj.getHealth();
			System.out.println(debug);
		}
	}

	public void attack() {
		if (this.isDestroyed()) {
			return;
		}
		double min = this.attackRange;
		for (GameObject obj : GameObject.gameObjects) {
			if (obj.isDestroyed() || obj.player == this.player) {
				continue;// don't return
			}
			if (this.getDistance(obj) <= min) {
				min = this.getDistance(obj);
			}
		}
		for (GameObject obj : GameObject.gameObjects) {
			if (obj.isDestroyed() || obj.player == this.player) {
				continue;// don't return
			}
			if (this.getDistance(obj) - min < 0.000001) {
				attack(obj);
			}
		}
	}

	public boolean isDestroyed() {
		return lifeValue <= 0;
	}
}
