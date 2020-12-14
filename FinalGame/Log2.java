import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Log2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Log2 extends Actor
{
    /**
     * Act - do whatever the Log2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count;
    String Log2;
    public Log2 () {
        getImage().scale(100,50);
    }
    public void act() 
    {
        //move(2);
        //IsInWater();
        setLocation(getX(), getY());
        count ++;
        if (count % 10 == 0 && this.Log2 == Log2){
            setLocation(getX() -15, getY());
        }
        if (getX() == 0)
        setLocation(getWorld().getWidth()-2, getY());
        if(getX() == getWorld().getWidth()-1)
        setLocation(1, getY());
        
        //if (getX() >= 748) 
        //{
            //getWorld().removeObject(this);
        //}
    }  
    public int gettingRandomNumber()
    {
        return Greenfoot.getRandomNumber(20);
    }
}
