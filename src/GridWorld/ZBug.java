package GridWorld;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class ZBug extends Bug {
	private int steps;
	private int xLength;
	private int x;

	public ZBug(int length) {
		setDirection(Location.EAST);
		steps = 0;
		x = 1;
		xLength = length;
	}

	public void act() {
		if (x < 4 && steps < xLength) {
			if (canMove()) {
				move();
				steps++;
			}
		} else if (x == 1) {
			setDirection(Location.SOUTHWEST);
			steps = 0;
			x++;
		} else if (x == 2) {
			setDirection(Location.EAST);
			steps = 0;
			x++;
		}
	}
}
