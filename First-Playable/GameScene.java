import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameScene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameScene extends World
{

    /**
     * Constructor for objects of class GameScene.
     * 
     */
    public GameScene()
    {    
        super(750, 750, 1); 
        addObject(new CreditScene(), 375, 410);
    }
}
