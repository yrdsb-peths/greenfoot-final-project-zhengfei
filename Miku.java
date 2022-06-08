import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Miku, our hero.
 * 
 * @author Zhengfei Zhang 
 * @version June 8 2022
 */
public class Miku extends Actor
{
    GreenfootSound backgroundSound = new GreenfootSound("World_is_Mine-Hatsune_Miku.mp3");
    /**
     * Act - do whatever the Miku wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        //plays the background song.
        backgroundSound.play();
    }
}
