import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count;
    String Rock;
    public Rock()
    {
        //getImage().scale(60,60);
    }
    public void act() 
    {
        //if (getX() >= 748) 
        //{
            //getWorld().removeObject(this);
        //}
        //move(1);
        setLocation(getX(), getY());
        count ++;
        rockMovement();
    }    
    public void rockMovement(){
        if (count % 10 == 0 && this.Rock == Rock){
            setLocation(getX() + 10, getY());
        }
        if (getX() == 0)
        setLocation(getWorld().getWidth()-2, getY());
        if(getX() == getWorld().getWidth()-1)
        setLocation(1, getY());
    }
}
