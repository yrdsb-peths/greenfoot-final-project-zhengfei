import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The keys for the user to press.
 * 
 * @author Zhengfei Zhang
 * @version June 8 2022
 */
public class keys extends Actor
{
    /**
     * Act - do whatever the Key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 1;
    
    public void act()
    {
        // Add your action code here.
        
        // Key falls down.
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
    }
}
