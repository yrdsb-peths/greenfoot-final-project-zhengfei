import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The left keys for the user to press.
 * 
 * @author Zhengfei Zhang
 * @version June 8 2022
 */
public class KeyLeft extends Actor
{
    GreenfootImage[] keyLeft;
    int speed = 1;
    int random = Greenfoot.getRandomNumber(4);
    /**
     * Constructor: Runs everytime when an object is created.
     */
    public KeyLeft()
    {
        keyLeft = new GreenfootImage[4];
        for(int i = 0; i < keyLeft.length; i++)
        {
            keyLeft[i] = new GreenfootImage("Images/keys/leftKeys/key" + i + ".png");
            keyLeft[i].scale(200, 150);
        }
        
        //Initialize the key to a random image.
        setImage(keyLeft[0]);
    }
    
    /**
     * Act - do whatever the Key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        MyWorld world = (MyWorld) getWorld();
        // Key falls down.
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
