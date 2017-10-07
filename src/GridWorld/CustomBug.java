package GridWorld;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;



public class CustomBug extends Bug {
	private int steps;
	private int start;

	public CustomBug(int x) {
		start = x;
	    setColor(Color.BLACK);
	}

	public void act() {
		if (steps < start && canMove()) {
			move2();
			steps++;
		} else {
			turn();
			steps = 0;
		}
	}
	
	public String toString() {
		return super.toString() + "Hi, I'm a \"Dinosaur\"!";
	}

	public CustomBug() {
		super();
	}
 

	 public void move2()
	    {
	        Grid<Actor> gr = getGrid();
	        if (gr == null)
	            return;
	        Location loc = getLocation();
	        Location next = loc.getAdjacentLocation(getDirection());
	        if (gr.isValid(next))
	            moveTo(next);
	        else
	            removeSelfFromGrid();
	        Bug bug = new Bug(getColor());
	        bug.putSelfInGrid(gr, loc);
	    }

	}
