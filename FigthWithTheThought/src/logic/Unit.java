package logic;

import java.util.ArrayList;
import java.util.List;

public class Unit {
	
	ArrayList<Action>actions=new ArrayList<>();
	
	public void move(Action action){
		action.spell();
	}
	
	UnitListener unitListener;

	public void addUnitListener(UnitListener unitListener){
		this.unitListener=unitListener;
	}
	
	int hp;
	int damage;
	int timeToMove;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
		unitListener.getHp(hp);
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
		unitListener.getDamage(damage);
	}

	public int getTimeToMove() {
		return timeToMove;
	}

	public void setTimeToMove(int timeToMove) {
		this.timeToMove = timeToMove;
		unitListener.getTime(timeToMove);
	}
	
	public boolean subtractTime(int diff){
		setTimeToMove(timeToMove-diff);
		if(timeToMove<0){
			timeToMove=0;
			return false;
		}
		return true;
	}

	Runnable run = new Runnable() {
		@Override
		public void run() {
			long startTime = System.currentTimeMillis();
			while (Thread.currentThread().isInterrupted()) {
				long currentTime = System.currentTimeMillis();
				long diff = startTime - currentTime;
				timeToMove -= diff;
				startTime = currentTime;
			}
		}
	};

	Thread thread = new Thread(run);

	public void startTimer() {
		if (thread.isInterrupted()) {
			thread = new Thread(run);
		} else if (!thread.isAlive())
			thread.start();
	}

	public void stopTimer() {
		thread.interrupt();
	}

}
