import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world our hero lives in.
 * 
 * @Zhenfei Zhang
 * @June 6 2022
 */
public class MyWorld extends World
{
    GreenfootSound easyMusic = new GreenfootSound("Nekomimi Switch.mp3");
    GreenfootSound moderateMusic = new GreenfootSound("Hatsune Miku sings _Ievan Polkka_.mp3");
    GreenfootSound hardMusic = new GreenfootSound("Hatsune_Miku_no_Shoushitsu.mp3");
    int level = 1;
    static Counter score = new Counter("Score: ");
    public int trackScore = 0;
    Counter lives = new Counter("Lives: ");
    public int trackLives = 10;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1, false); 

        // Creates the miku object.
        MikuUp mikuUp = new MikuUp();
        addObject(mikuUp, 150, 600);
        MikuDown mikuDown = new MikuDown();
        addObject(mikuDown, 380, 600);
        MikuLeft mikuLeft = new MikuLeft();
        addObject(mikuLeft, 615, 600);
        MikuRight mikuRight = new MikuRight();
        addObject(mikuRight, 850, 600);
        // Create the keys objects.
        createKeyUp();
        createKeyDown();
        createKeyLeft();
        createKeyRight();
        // Records the score.
        addObject(score, 100, 50);
        score.setValue(trackScore);
        // record the lives left.
        addObject(lives, 900, 50);
        lives.setValue(trackLives);
    }
    
    /**
     * Play the first music when game starts.
     */
    public void act()
    {
        // Play the music in a loop.
        easyMusic.playLoop();
    }
    
    /**
     * Ends the game.
     */
    public void gameOver()
    {
        Greenfoot.setWorld(new GameOver());
        easyMusic.stop();
        moderateMusic.stop();
        hardMusic.stop();
    }

    /**
     * Creates a new up key
     */
    public void createKeyUp()
    {     
        KeyUp keyUp = new KeyUp();
        keyUp.setSpeed(Greenfoot.getRandomNumber(4)+level);
        int x = 150;
        int y = 155;
        addObject(keyUp, x, y);
    }

    /**
     * Creates a new down key
     */
    public void createKeyDown()
    {     
        KeyDown keyDown = new KeyDown();
        keyDown.setSpeed(Greenfoot.getRandomNumber(4)+level);
        int x = 380;
        int y = 155;
        addObject(keyDown, x, y);
    }

    /**
     * Creates a new left key
     */
    public void createKeyLeft()
    {     
        KeyLeft keyLeft = new KeyLeft();
        keyLeft.setSpeed(Greenfoot.getRandomNumber(4)+level);
        int x = 615;
        int y = 155;
        addObject(keyLeft, x, y);
    }

    /**
     * Creates a new right key
     */
    public void createKeyRight()
    {     
        KeyRight keyRight = new KeyRight();
        keyRight.setSpeed(Greenfoot.getRandomNumber(4)+level);
        int x = 850;
        int y = 155;
        addObject(keyRight, x, y);
    }
    
    /**
     * Increases the score and adds difficulty for every 100 points
     */
    public void increaseScore()
    {
        trackScore += 5;
        score.setValue(trackScore);
        if(trackScore % 100 == 0)
        {
            level += 1;
        }
        if(trackScore >= 100)
        {
            easyMusic.stop();
            moderateMusic.play();
        }
        else if(trackScore >= 200)
        {
            moderateMusic.stop();
            hardMusic.play();
        }
    }
    
    /**
     * Decrease the lives and dies when trackLives = 0.
     */
    public void decreaseLives()
    {
        trackLives --;
        lives.setValue(trackLives);
        if(trackLives <= 0)
        {
            gameOver();
        }
    }
}
