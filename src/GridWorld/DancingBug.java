package GridWorld;

import java.awt.Color;

import info.gridworld.actor.Bug;

public class DancingBug extends Bug {

	private int step;
	private int x;

	public DancingBug() {
		step = 0;
		setColor(Color.ORANGE);
	}

	public void turn(int x) {
		x = (int) (Math.random() * 2) - 2;
		for (int i = 1; i <= x; i++) {
			turn();
		}
	}

	public void act() {
		if (step == x)
			step = 0;
		turn(x);
		step++;
		super.act();
	}
}