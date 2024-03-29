import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Miku, our hero that's responsible for the down arrows.
 * 
 * @author Zhengfei Zhang 
 * @version June 26 2022
 */
public class MikuLeft extends Actor
{
    GreenfootImage[] mikuLeft;
    /**
     * Constructor: Runs everytime when an object is created.
     */
    public MikuLeft()
    {
        mikuLeft = new GreenfootImage[15];
        for(int i = 0; i < mikuLeft.length; i++)
        {
            mikuLeft[i] = new GreenfootImage("Images/AnimateMiku/AnimateMiku" + i + ".png");
            mikuLeft[i].scale(200, 100);
        }

        // Initial Miku image.
        setImage(mikuLeft[9]);
    }

    int imageIndex = 0;
    /**
     * Miku will move evertime when left key is pressed.
     */
    public void animationMiku()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setImage(mikuLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % mikuLeft.length;
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
     * Miku touches the key and user hits the right key to create a new key and increase score
     * if key is missed, lives decrease.
     */
    public void spawnKey()
    {
        if(isTouching(KeyLeft.class))
        {
            removeTouching(KeyLeft.class);
            MyWorld world = (MyWorld) getWorld();
            world.createKeyLeft();
            if(Greenfoot.isKeyDown("left"))
            {
                world.increaseScore();
            }
            else
            {
                world.decreaseLives();
            }
        }
    }
}