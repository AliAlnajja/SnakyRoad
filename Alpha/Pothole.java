import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pothole here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pothole extends Actor
{
    private GreenfootImage image1 =  new GreenfootImage("Pothole.png");
    /**
     * Act - do whatever the Pothole wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pothole(){
        (this.image1).scale(50,30);
        setImage(image1);
    }
    public void act() 
    {
        
    }
}
