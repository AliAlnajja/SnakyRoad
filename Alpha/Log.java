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
        getImage().scale(50,50);
    }
    public void act() 
    {
        //move(2);
        IsInWater();
        setLocation(getX(), getY());
        if (getX() >= 748) 
        {
            getWorld().removeObject(this);
        }
    }    
    public void IsInWater()
    {
        if (getWorld().getClass() == level2.class)
        {
            if(getY()>75&&getY()<675)
            {
                setLocation(getX()+1,getY());
            }
        }
    }    
}
