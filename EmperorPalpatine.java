import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.actor.Rock;

public class EmperorPalpatine extends Critter
{
	public ArrayList<Actor> getActors()
	{
		Grid<Actor> gr = getGrid();
		ArrayList actor = new ArrayList<Actor>();
		Location one = getLocation();
		Location two = one.getAdjacentLocation(getDirection());
		while(actor.size() == 0){
			if(gr.get(two).isValid() == true){
				Actor neighbor = gr.get(two);

				if(neighbor instanceof Rock){
					return actor;
				}
				else if(neighbor == null){
					one = two;
					two = one.getAdjacentLocation(getDirection());
				}
				else{
					actor.add(neighbor);
				}
			}
			else{
				break;
			}
		}
		return actor;
	}

	public void processActors(ArrayList<Actor> actors)
	{

		if(actors.size() == 0){

		}
		else{
			Location loc = actors[0].getLocation();
			actors[0].removeSelfFromGrid();
			Ash ash = new Ash();
			ash.putSelfInGrid(gr, loc);
		}
	}
	/**
	* Turns towards the new location as it moves.
	*/
	public void makeMove(Location loc)
	{
		setDirection(getLocation().getDirectionToward(loc));
		super.makeMove(loc);
	}
}
