import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The keys for the user to press.
 * 
 * @author Zhengfei Zhang
 * @version June 8 2022
 */
public class keys extends Actor
{
    GreenfootImage[] upImage;
    GreenfootImage[] downImage;
    GreenfootImage[] rightImage;
    GreenfootImage[] leftImage;
    int speed = 1;
    int random = Greenfoot.getRandomNumber(6);
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
            downImage[i] = new GreenfootImage("Images/keys/downKeys/key" + i + ".png");
            downImage[i].scale(200, 150);
            rightImage[i] = new GreenfootImage("Images/keys/rightKeys/key" + i + ".png");
            rightImage[i].scale(200, 150);
            leftImage[i] = new GreenfootImage("Images/keys/leftKeys/key" + i + ".png");
            leftImage[i].scale(200, 150);
        }
        
        //Initialize the key to a random image.
        setImage("Images/keys/upKeys/key" + random + ".png");
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
}
