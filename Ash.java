import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Rock;
import java.util.ArrayList;

public class Ash extends Rock
{
/**
* Constructs an ash that is the color of the image.
*/
    public Ash()
    {
        setColor(null);
    }
/**
* Constructs a rock of a given color.
* @param rockColor the color of this rock
*/
    public Ash(Color ashColor)
    {
        setColor(ashColor);

    }
}
