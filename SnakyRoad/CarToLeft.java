import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class CopyOfCar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarToLeft extends Actor
{
    /**
     * Act - do whatever the CopyOfCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-4);
        setLocation(getX(), getY());
        if (getX() < 1) 
        {
            getWorld().removeObject(this);
        }
    }
}
