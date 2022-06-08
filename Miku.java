import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Miku, our hero.
 * 
 * @author Zhengfei Zhang 
 * @version June 8 2022
 */
public class Miku extends Actor
{

    /**
     * Act - do whatever the Miku wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound backgroundSound = new GreenfootSound("World_is_Mine-Hatsune_Miku.mp3");
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
    
    public void act()
    {
        // Add your action code here.
        
        //plays the background song.
        backgroundSound.play();
    }
}
