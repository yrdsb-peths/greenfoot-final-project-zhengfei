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
    int levelEasyUp = Greenfoot.getRandomNumber(5)+1;
    int levelEasyDown = Greenfoot.getRandomNumber(5)+1;
    int levelEasyLeft = Greenfoot.getRandomNumber(5)+1;
    int levelEasyRight = Greenfoot.getRandomNumber(5)+1;
    int levelModerateUp = levelEasyUp+5;
    int levelModerateDown = levelEasyDown+5;
    int levelModerateLeft = levelEasyLeft+5;
    int levelModerateRight = levelEasyRight+5;
    int levelHardUp = levelModerateUp+10;
    Label score;
    public static int trackScore = 0;
    Label lives;
    public static int trackLives = 5;
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
        score = new Label(0, 100);
        addObject(score, 100, 50);
        // record the lives left.
        lives = new Label(5, 100);
        addObject(lives, 900, 50);
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
        Label gameOver = new Label("Game Over", 200);
        addObject(gameOver, 500, 350);
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
        keyUp.setSpeed(levelEasyUp);
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
        keyDown.setSpeed(levelEasyDown);
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
        keyLeft.setSpeed(levelEasyLeft);
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
        keyRight.setSpeed(levelEasyRight);
        int x = 850;
        int y = 155;
        addObject(keyRight, x, y);
    }
    
    /**
     * Increases the score
     */
    public void increaseScore()
    {
        trackScore += 5;
        score.setValue(trackScore);
        if(trackScore <= 50)
        {
            easyMusic.stop();
            moderateMusic.play();
        }
    }
    
    /**
     * Decrease the lives.
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
    
    /**
     * Set random speed for keys everytime it touches Miku.
     */
    public void randomSpeed()
    {
    }
}
