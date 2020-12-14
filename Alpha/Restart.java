import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart extends Actor
{
    /**
     * Act - do whatever the Restart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        toLevel1();
    }  
    public void toLevel1(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Level1());
            Greenfoot.playSound("Level1Bgm.mp3");
        }
    }
}
