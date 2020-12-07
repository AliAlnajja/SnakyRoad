import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alligator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alligator extends Actor
{
    private int count = 0;
    /**
     * Act - do whatever the Alligator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-2);
        getImage().scale(40,40);
        zigzag();
        if (getX() >= 748) 
        {
            getWorld().removeObject(this);
        }
    }
    public int counter(){
        if(count<300){
            return count++;
        }
        else{
            count = 0;
            return count;
        }
    }
    public void zigzag(){
        if (counter()==0){
            setRotation(225);
        } else if(counter()==150){
            setRotation(135);
        } 
    }
}
