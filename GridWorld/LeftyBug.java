package GridWorld;

import info.gridworld.actor.Bug;

public class LeftyBug extends Bug {
	public void turn() {
		setDirection(getDirection() - 45);
	}

	public String toString() {
		return super.toString() + "Hi, I'm a \"LeftyBug\"!";
	}
}

