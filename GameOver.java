import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Shows screen when the world ended.
 * 
 * @Zhengfei Zhang
 * @June 20 2022
 */
public class GameOver extends World
{
    GreenfootSound gameOver = new GreenfootSound("Hatsune_Miku_no_Shoushitsu.mp3");
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1);
        Label gameOver = new Label("Game Over", 200);
        addObject(gameOver, 500, 350);
    }
    
    /** 
     * Background music is played.
     */
    public void act()
    {
        // Add your action code here.
        //plays the background song.
        gameOver.playLoop();
    }
}
