
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeyPress();
    }
    
    public void checkKeyPress(){
        if (Greenfoot.isKeyDown("d")){
            setLocation(getX()+3, getY());
        }
        if (Greenfoot.isKeyDown("a")){
            setLocation(getX()-3, getY());
        }
        if (Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY()-3);
        }
        if (Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+3);
        }
    }
}
