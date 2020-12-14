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
    int count;
    String Log;
    public Log () {
        getImage().scale(100,50);
    }
    public void act() 
    {
        //move(2);
        //IsInWater();
        setLocation(getX(), getY());
        count ++;
        logMovement();
        //if (getX() >= 748) 
        //{
            //getWorld().removeObject(this);
        //}
    }    
    //public void IsInWater()
    //{
        //if (getWorld().getClass() == level2.class)
        //{
            //if(getY()>75&&getY()<675)
            //{
               // setLocation(getX()+1,getY());
            //}
        //}
    //}   
    public int gettingRandomNumber()
    {
        return Greenfoot.getRandomNumber(20);
    }
    public void logMovement(){
        if (count % 10 == 0 && this.Log == Log){
            setLocation(getX() + 20, getY());
        }
        if (getX() == 0)
        setLocation(getWorld().getWidth()-2, getY());
        if(getX() == getWorld().getWidth()-1)
        setLocation(1, getY());
    }
}
