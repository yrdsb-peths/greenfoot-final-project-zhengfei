import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world our hero lives in.
 * 
 * @Zhenfei Zhang
 * @June 6 2022
 */
public class MyWorld extends World
{
    GreenfootSound easyMusic = new GreenfootSound("Nekomimi Switch.mp3");
    int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1, false); 

        // Creates the miku object.
        MikuUp mikuUp = new MikuUp();
        addObject(mikuUp, 150, 600);
        MikuDown mikuDown = new MikuDown();
        addObject(mikuDown, 380, 600);
        MikuLeft mikuLeft = new MikuLeft();
        addObject(mikuLeft, 615, 600);
        MikuRight mikuRight = new MikuRight();
        addObject(mikuRight, 850, 600);
        // Play the music in a loop.
        easyMusic.playLoop();
        //Create the keys objects.
        createKeyUp();
        createKeyDown();
        createKeyLeft();
        createKeyRight();
    }
    
    /**
     * Creates a new up key
     */
    public void createKeyUp()
    {     
        KeyUp keyUp = new KeyUp();
        keyUp.setSpeed(level);
        int x = 150;
        int y = 100;
        addObject(keyUp, x, y);
    }
    
    /**
     * Creates a new down key
     */
    public void createKeyDown()
    {     
        KeyDown keyDown = new KeyDown();
        keyDown.setSpeed(level);
        int x = 380;
        int y = 100;
        addObject(keyDown, x, y);
    }
    
    /**
     * Creates a new left key
     */
    public void createKeyLeft()
    {     
        KeyLeft keyLeft = new KeyLeft();
        keyLeft.setSpeed(level);
        int x = 615;
        int y = 100;
        addObject(keyLeft, x, y);
    }
    
    /**
     * Creates a new right key
     */
    public void createKeyRight()
    {     
        KeyRight keyRight = new KeyRight();
        keyRight.setSpeed(level);
        int x = 850;
        int y = 100;
        addObject(keyRight, x, y);
    }
}
