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
        Miku miku = new Miku();
        addObject(miku, 500, 350);
        // Play the music in a loop.
        easyMusic.playLoop();
        
    }
    
    /**
     * Creates a new key
     */
    public void createKeys()
    {     
        Keys keys = new Keys();
        keys.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(keys, x, y);
    }
}
