import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car3 extends Actor
{
    /**
     * Act - do whatever the Car3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(6);
        setLocation(getX(), getY());
        if (getX() >= 748) 
        {
            getWorld().removeObject(this);
        }
    }   
}
