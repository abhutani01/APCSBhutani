package GridWorld2;

import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
	private int steps;
	private int sideLength;

	public DancingBug(int length) {
		steps = 0;
		sideLength = length;
	}

	public void act() {
		if (steps < sideLength && canMove()) {
			move();
			steps++;
		} else {
		int x = ((int)Math.random() * -2) + 2;
		while (steps < x) {
			turn();	
		}
	
			steps = 0;
			
		}
	}
}
