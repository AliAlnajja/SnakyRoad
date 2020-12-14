import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditScene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditScene extends Actor
{   
    public CreditScene(){
       getImage().scale(800, 800);
       GreenfootImage image = getImage();
       image.scale(image.getWidth()-10, image.getHeight());
       setImage(image);
    }
    /**
     * Act - do whatever the CreditScene wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
}
