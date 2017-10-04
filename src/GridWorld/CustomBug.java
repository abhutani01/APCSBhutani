package GridWorld;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;



public class CustomBug extends Bug {
	private int steps;
	private int sideLength;
	private int x;
 
	public CustomBug(int length) {
		steps = 0;
		sideLength = length;
		x = 0;
		setColor(Color.GREEN);
	}

	public void act()  {
		if (steps < sideLength && canMove()) {
			move();
			steps++;
		} 
		else {
			turn();
		 Grid<Actor> gr = getGrid();
	        if (gr == null)
	            return;
	        Location loc = getLocation();
	        Location next = loc.getAdjacentLocation(getDirection());
	        if (gr.isValid(next))
	            moveTo(next);
	        else
	            removeSelfFromGrid();
	        Rock rock = new Rock(getColor());
	        rock.putSelfInGrid(gr, loc);
	        Bug bug = new Bug(getColor());
	        bug.putSelfInGrid(gr, loc);
	        
	    }
	
			steps = 0;
			
		}
	}
