import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The down keys for the user to press.
 * 
 * @author Zhengfei Zhang
 * @version June 26 2022
 */
public class KeyDown extends Actor
{
    GreenfootImage[] keyDown;
    int speed = 1;
    int random = Greenfoot.getRandomNumber(4);

    /**
     * Constructor: Runs everytime when an object is created.
     */
    public KeyDown()
    {
        keyDown = new GreenfootImage[4];
        for(int i = 0; i < keyDown.length; i++)
        {
            keyDown[i] = new GreenfootImage("Images/keys/downKeys/key" + i + ".png");
            keyDown[i].scale(200, 150);
        }

        //Initialize the key.
        setImage(keyDown[1]);
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