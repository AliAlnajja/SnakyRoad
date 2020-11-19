import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    //private int count = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Snake snake = new Snake();
        addObject(snake,276,364);
        /*Car car = new Car();
        addObject(car,30,49);
        Car car2 = new Car();
        addObject(car2,21,151);
        Car car3 = new Car();
        addObject(car3,18,239);
        removeObject(car3);*/
    }
    public void act()
    {
        if (Greenfoot.getRandomNumber(200)<1)
        {
            addObject(new Car(), 1, 50);
        }
        if (Greenfoot.getRandomNumber(200)<1)
        {
            addObject(new Car(), 1, 90);
        }
        if (Greenfoot.getRandomNumber(200)<1)
        {
            addObject(new Car(), 1, 130);
        }
        if (Greenfoot.getRandomNumber(200)<1)
        {
            addObject(new CarToLeft(), 599, 170);
        }
        if (Greenfoot.getRandomNumber(200)<1)
        {
            addObject(new CarToLeft(), 599, 210);
        }
    } 
}
