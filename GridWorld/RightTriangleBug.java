package GridWorld;

import java.awt.Color;

import info.gridworld.actor.Bug;

public class RightTriangleBug extends Bug {
	private int steps;
	private int sideLength;

	public RightTriangleBug(int length) {
		steps = 0;
		sideLength = length;
		setColor(Color.GREEN);
	}

	public void act() {
		if (steps < sideLength && canMove()) {
			move();
			steps++;
		} 
		else {
		int x = ((int)Math.random() * -2) + 2;
		for (int i = 0; i<=x;  i++) {
			turn();	
		}
	
			steps = 0;
			
		}
	}
}


