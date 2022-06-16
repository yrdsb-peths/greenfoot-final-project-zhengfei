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
        createKeys();
    }
    
    /**
     * Creates a new key
     */
    public void createKeys()
    {     
        Keys keys = new Keys();
        keys.setSpeed(level);
        int x = 20;
        int y = 350;
        addObject(keys, x, y);
    }
}
