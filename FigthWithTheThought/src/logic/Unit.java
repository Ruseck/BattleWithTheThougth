package logic;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.notification.StoppedByUserException;

public class Unit {

	public void addListener(Listener l) {
		listener = l;
	}

	private Listener listener = (i) -> {
	};

	private int healthPoint;
	private int damage;
	private int manaPoint;
	private int speed;

	private int currentHealthPoint;
	private int currentDamage;
	private int currentManaPoint;
	private int currentSpeed;

	private int waitToMove=100000;
	private boolean canMakeMove;

	private List<Action> actions = new ArrayList<>();

	public Unit(int healthPoint, int damage, int manaPoint, int speed, List<Action> actions) {
		super();
		currentHealthPoint = this.healthPoint = healthPoint;
		currentDamage = this.damage = damage;
		currentManaPoint = this.manaPoint = manaPoint;
		currentSpeed = this.speed = speed;
		this.actions = actions;
	}

	public void makeAction(Action action) {
		action.start();
		canMakeMove=false;
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

	public void start() {
		mover=new Thread(r);
		mover.start();
	}

	public void stop() {
		mover.interrupt();
	}

	private Runnable r = () -> {
		while (Thread.currentThread().isInterrupted()) {
			waitToMove -= speed;
			if (waitToMove > 0) {
				waitToMove = 0;
				canMakeMove = true;
				listener.listen(waitToMove);
				break;
			}
			listener.listen(waitToMove);
		}
	};

	private Thread mover;

}
