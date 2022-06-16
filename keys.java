import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The keys for the user to press.
 * 
 * @author Zhengfei Zhang
 * @version June 8 2022
 */
public class keys extends Actor
{
    GreenfootImage[] image;
    int speed = 1;
    /**
     * Constructor: Runs everytime when an object is created.
     */
    public keys()
    {
        upImage = new GreenfootImage[6];
        for(int i = 0; i < upImage.length; i++)
        {
            upImage[i] = new GreenfootImage("Images/keys/upKeys/key" + i + ".png");
            upImage[i].scale(200, 150);
        }
        
        downImage = new GreenfootImage[6];
        for(int i = 0; i < downImage.length; i++)
        {
            downImage[i] = new GreenfootImage("Images/keys/downKeys/key" + i + ".png");
            downImage[i].scale(200, 150);
        }
        
        rightImage = new GreenfootImage[6];
        for(int i = 0; i < rightImage.length; i++)
        {
            rightImage[i] = new GreenfootImage("Images/keys/rightKeys/key" + i + ".png");
            rightImage[i].scale(200, 150);
        }
        
        leftImage = new GreenfootImage[6];
        for(int i = 0; i < leftImage.length; i++)
        {
            leftImage[i] = new GreenfootImage("Images/keys/leftKeys/key" + i + ".png");
            leftImage[i].scale(200, 150);
        }
    }
    /**
     * Act - do whatever the Key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
        // Key falls down.
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
    }
}
