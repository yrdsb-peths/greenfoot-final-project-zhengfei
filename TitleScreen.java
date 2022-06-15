import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title screen, or the opening screen.
 * 
 * @author Zhengfei Zhang
 * @version June 8 2022
 */
public class TitleScreen extends World
{
    GreenfootSound backgroundSound = new GreenfootSound("World_is_Mine-Hatsune_Miku.mp3");

    /**
     * Constructor for objects of class TitleScreen.
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1);
        prepare();
    }
    
    // Background music is played when user hits run.
    public void act()
    {
        // Add your action code here.
        // Start the game if the user presses the space bar.
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
        //plays the background song.
        backgroundSound.play();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,285,274);
        label.setLocation(500,600);
        Label title = new Label("HatsumeVoid", 100);
        addObject(title,285,274);
        title.setLocation(500,350);
    }
}
