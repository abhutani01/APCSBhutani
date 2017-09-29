package GridWorld;

import info.gridworld.actor.Bug;

public class Exercises {
	public class CircleBug extends Bug {
		private int steps;
		private int sideLength;

		public CircleBug(int length) {
			steps = 0;
			length = 4;
			sideLength = length;
		}

		public void act() {
			if (steps < sideLength && canMove()) {
				move();
				steps++;
			} else {
				turn();
				turn();
				steps = 0;
			}
		}
	}


	public class SpiralBug extends Bug{
		private Object world;

		public void CircleBug() {
		
		}
	}
}
