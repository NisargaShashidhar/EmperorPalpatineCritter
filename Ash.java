import java.awt.Color;


public class Ash extends Rock
{
    
    
    private static final Color DEFAULT_COLOR = Color.BLACK;

    /**
     * Constructs a black ash.
     */
    public Ash()
    {
        setColor(DEFAULT_COLOR);
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
