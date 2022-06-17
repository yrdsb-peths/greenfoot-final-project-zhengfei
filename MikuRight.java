import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Miku, our hero that's responsible for the down arrows.
 * 
 * @author Zhengfei Zhang 
 * @version June 8 2022
 */
public class MikuRight extends Actor
{
    GreenfootImage[] mikuRight;
    /**
     * Constructor: Runs everytime when an object is created.
     */
    public MikuRight()
    {
        mikuRight = new GreenfootImage[15];
        for(int i = 0; i < mikuRight.length; i++)
        {
            mikuRight[i] = new GreenfootImage("Images/AnimateMiku/AnimateMiku" + i + ".png");
            mikuRight[i].scale(200, 100);
        }
        
        // Initial Miku image.
        setImage(mikuRight[0]);
    }
    
    int imageIndex = 0;
    /**
     * Miku will move evertime when left, right, up or down is pressed.
     */
    public void animationMiku()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setImage(mikuRight[imageIndex]);
            imageIndex = (imageIndex + 1) % mikuRight.length;
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
        if(isTouching(KeyRight.class))
        {
            removeTouching(KeyRight.class);
            MyWorld world = (MyWorld) getWorld();
            world.createKeyRight();
        }
    }
}
