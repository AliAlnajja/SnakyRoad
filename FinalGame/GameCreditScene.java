import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameCreditScene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameCreditScene extends World
{

    /**
     * Constructor for objects of class GameCreditScene.
     * 
     */
    public GameCreditScene()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1); 
        addObject(new CreditScene(), 375, 375);
    }
}
