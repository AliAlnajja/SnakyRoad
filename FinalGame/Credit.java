import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credit extends Actor
{
    /**
     * Act - do whatever the Credit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        toCredits();
    }
    public void toCredits(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new GameCreditScene());
        }
        
    }
}
