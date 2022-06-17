import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The up keys for the user to press.
 * 
 * @author Zhengfei Zhang
 * @version June 8 2022
 */
public class KeyUp extends Actor
{
    GreenfootImage[] keyUp;
    int speed = 1;
    int random = Greenfoot.getRandomNumber(4);
    /**
     * Constructor: Runs everytime when an object is created.
     */
    public KeyUp()
    {
        keyUp = new GreenfootImage[6];
        for(int i = 0; i < keyUp.length; i++)
        {
            keyUp[i] = new GreenfootImage("Images/keys/upKeys/key" + i + ".png");
            keyUp[i].scale(200, 150);
        }
        
        //Initialize the key to a random image.
        setImage(keyUp[0]);
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
