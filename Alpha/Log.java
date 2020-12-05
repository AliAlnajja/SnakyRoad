import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Log here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Log extends Actor
{
    /**
     * Act - do whatever the Log wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Log () {
        getImage().scale(100,40 );
    }
    public void act() 
    {
        move(2);
        setLocation(getX(), getY());
        if (getX() >= 748) 
        {
            getWorld().removeObject(this);
        }
    }    
}    

