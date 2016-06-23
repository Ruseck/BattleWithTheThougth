package logic;

import java.util.ArrayList;
import java.util.List;

public class Unit {

	private int healthPoint;
	private int damage;
	private int manaPoint;
	private int speed;

	private int currentHealthPoint;
	private int currentDamage;
	private int currentManaPoint;
	private int currentSpeed;
	
	private boolean canMakeAction=false;
	private int timeToAction;

	private List<Action> actions = new ArrayList<>();

	public Unit(int healthPoint, int damage, int manaPoint, int speed, List<Action>actions) {
		super();
		currentHealthPoint = this.healthPoint = healthPoint;
		currentDamage = this.damage = damage;
		currentManaPoint = this.manaPoint = manaPoint;
		currentSpeed = this.speed = speed;
		this.actions=actions;
	}
	
	public void makeAction(Action action){
		action.start();
	}

	public int getHealthPoint() {
		return healthPoint;
	}

	public void setHealthPoint(int healthPoint) {
		this.healthPoint = healthPoint;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getManaPoint() {
		return manaPoint;
	}

	public void setManaPoint(int manaPoint) {
		this.manaPoint = manaPoint;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getCurrentHealthPoint() {
		return currentHealthPoint;
	}

	public void setCurrentHealthPoint(int currentHealthPoint) {
		this.currentHealthPoint = currentHealthPoint;
	}

	public int getCurrentDamage() {
		return currentDamage;
	}

	public void setCurrentDamage(int currentDamage) {
		this.currentDamage = currentDamage;
	}

	public int getCurrentManaPoint() {
		return currentManaPoint;
	}

	public void setCurrentManaPoint(int currentManaPoint) {
		this.currentManaPoint = currentManaPoint;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

}
