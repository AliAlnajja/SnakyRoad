import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bat extends Actor
{
    private GreenfootImage image1 =  new GreenfootImage("Bat.png");
    /**
     * Act - do whatever the Bat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bat()
    {
        //(this.image1).scale(10,10);
    } 
    public void act() 
    {
        move(2);
        if(isAtEdge()==true){
            setRotation(Greenfoot.getRandomNumber(360));
        }
    } 
}
