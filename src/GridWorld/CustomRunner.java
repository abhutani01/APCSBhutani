package GridWorld;


import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;

public class CustomRunner {
	public static void main(String[] args) {
		Grid<Actor> grid = new BoundedGrid<Actor>(20, 20);
		ActorWorld world = new ActorWorld(grid);
		world.add(new Rock());
		world.add(new Actor());
		world.show();
		world.add(new CustomBug(4));	

	}

}
