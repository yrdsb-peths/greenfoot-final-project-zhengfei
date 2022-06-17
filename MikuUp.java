import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Miku, our hero that's responsible for the up arrows.
 * 
 * @author Zhengfei Zhang 
 * @version June 8 2022
 */
public class MikuUp extends Actor
{
    GreenfootImage[] mikuUp;
    /**
     * Constructor: Runs everytime when an object is created.
     */
    public MikuUp()
    {
        mikuUp = new GreenfootImage[15];
        for(int i = 0; i < mikuUp.length; i++)
        {
            mikuUp[i] = new GreenfootImage("Images/AnimateMiku/AnimateMiku" + i + ".png");
            mikuUp[i].scale(200, 100);
        }
        
        // Initial Miku image.
        setImage(mikuUp[0]);
    }
    
    int imageIndex = 0;
    /**
     * Miku will move evertime when left, right, up or down is pressed.
     */
    public void animationMiku()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setImage(mikuUp[imageIndex]);
            imageIndex = (imageIndex + 1) % mikuUp.length;
        }
    }
    
    /**
     * Act - do whatever the Miku wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        animationMiku();
        spawnKey();
    }
    
    /**
     * Miku touches the key and creates new key
     */
    public void spawnKey()
    {
        if(isTouching(KeyUp.class) && Greenfoot.isKeyDown("up"))
        {
            removeTouching(KeyUp.class);
            MyWorld world = (MyWorld) getWorld();
            world.createKeyUp();
        }
    }
}
