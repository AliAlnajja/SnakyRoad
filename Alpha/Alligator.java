import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alligator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alligator extends Actor
{
    /**
     * Act - do whatever the Alligator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-6);
        getImage().scale(40,40);
        setRotation(135);
        zigzag();
        if (getX() >= 748) 
        {
            getWorld().removeObject(this);
        }
    }
    public void zigzag(){
        if (this.getY()>250){
            setRotation(225);
        } else if(this.getY()<350){
            setRotation(135);
        }
    }
}
