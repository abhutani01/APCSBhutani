package GridWorld;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class ZBug extends Bug {
	private int sideLength;
	private int steps;

	public ZBug(int length) {
		sideLength = length;
		steps = 0;
		setDirection (Location.EAST);
	}

	{

		if (steps <= sideLength) {
			if (canMove()) {
				move();
				steps++;
			}
		}

		else if (steps == sideLength) {
			setDirection(Location.SOUTHWEST);
			if (canMove()) {
				move();
				steps++;
			}
		}

		else if (steps < sideLength * 2) {
			if (canMove()) {
				move();
				steps++;
			}
		} 
		
		else if (steps == sideLength * 2) {
			setDirection(Location.EAST);
			if (canMove()) {
				move();
				steps++;
			}
		}

		else if (steps < sideLength * 3) {
			if (canMove()) {
				move();
				steps++;
			}
		}
	}
}