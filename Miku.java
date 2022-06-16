import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Miku, our hero.
 * 
 * @author Zhengfei Zhang 
 * @version June 8 2022
 */
public class Miku extends Actor
{
    GreenfootImage[] image;
    /**
     * Constructor: Runs everytime when an object is created.
     */
    public Miku()
    {
        image = new GreenfootImage[15];
        for(int i = 0; i < image.length; i++)
        {
            image[i] = new GreenfootImage("Images/AnimateMiku/AnimateMiku" + i + ".png");
            image[i].scale(200, 150);
        }
        
        // Initial Miku image.
        setImage(image[0]);
    }
    
    int imageIndex = 0;
    /**
     * Miku will move evertime when left, right, up or down is pressed.
     */
    public void animationMiku()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setImage(image[imageIndex]);
            imageIndex = (imageIndex + 1) % image.length;
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            setImage(image[imageIndex]);
            imageIndex = (imageIndex + 1) % image.length;
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            setImage(image[imageIndex]);
            imageIndex = (imageIndex + 1) % image.length;
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            setImage(image[imageIndex]);
            imageIndex = (imageIndex + 1) % image.length;
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
        if(isTouching(Keys.class))
        {
            removeTouching(Keys.class);
            MyWorld world = (MyWorld) getWorld();
            world.createKeys();
        }
    }
}
