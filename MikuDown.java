import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Miku, our hero that's responsible for the down arrows.
 * 
 * @author Zhengfei Zhang 
 * @version June 8 2022
 */
public class MikuDown extends Actor
{
    GreenfootImage[] mikuDown;
    /**
     * Constructor: Runs everytime when an object is created.
     */
    public MikuDown()
    {
        mikuDown = new GreenfootImage[15];
        for(int i = 0; i < mikuDown.length; i++)
        {
            mikuDown[i] = new GreenfootImage("Images/AnimateMiku/AnimateMiku" + i + ".png");
            mikuDown[i].scale(200, 100);
        }

        // Initial Miku image.
        setImage(mikuDown[5]);
    }

    int imageIndex = 0;
    /**
     * Miku will move evertime when left, right, up or down is pressed.
     */
    public void animationMiku()
    {
        if(Greenfoot.isKeyDown("down"))
        {
            setImage(mikuDown[imageIndex]);
            imageIndex = (imageIndex + 1) % mikuDown.length;
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
     * Miku touches the key and user input the right key to create new key.
     */
    public void spawnKey()
    {
        if(isTouching(KeyDown.class))
        {
            removeTouching(KeyDown.class);
            MyWorld world = (MyWorld) getWorld();
            world.createKeyDown();
            if(Greenfoot.isKeyDown("down"))
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
