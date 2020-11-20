
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
        isTouchingTheCar();
    }
    
    public void checkKeyPress(){
        if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")){
            setLocation(getX()+3, getY());
        }
        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")) {
            setLocation(getX()-3, getY());
        }
        if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-3);
        }
        if (Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+3);
        }
    }
    public void isTouchingTheCar(){
        if (isTouching(Car.class)){
            Greenfoot.stop();
        }
    }
}
