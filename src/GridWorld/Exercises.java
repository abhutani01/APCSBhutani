package GridWorld;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;

public class Exercises {
	public static void main(String[] args)
    {
    	Grid<Actor> grid = new BoundedGrid<Actor>(10, 10);
        ActorWorld world = new ActorWorld (grid);
    	
       
        MyActor x = new MyActor();
        world.add(x);
        world.add(new LeftyBug());
        
        MyActor y = new MyActor();
        world.add(y);
        world.add(new CircleBug(4));
        
        MyActor z = new MyActor();
        world.add(z);
        world.add(new SpiralBug());
        
        MyActor a = new MyActor();
        world.add(a);
        world.add(new ZBug(4));
    }
    

}
