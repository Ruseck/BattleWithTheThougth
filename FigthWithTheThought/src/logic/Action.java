package logic;

import java.util.List;

public abstract class Action {

	private Unit used;
	private List<Unit> targets;

	public Unit getUsed() {
		return used;
	}

	public void setUsed(Unit used) {
		this.used = used;
	}

	public Action(Unit used, List<Unit> targets) {
		super();
		this.used = used;
		this.targets = targets;
	}

	public List<Unit> getTargets() {
		return targets;
	}

	public void setTargets(List<Unit> targets) {
		this.targets = targets;
	}

	public abstract void start();
}
