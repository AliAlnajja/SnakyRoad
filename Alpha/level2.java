import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends World
{
    
    /**
     * Constructor for objects of class Level2.
     * 
     */
    private int count = 0;
    private int count2 = 0;
    private int timerInSeconds = 0; // this is the timer for water sound
    int [][] map = 
           {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0},
            {2,4,2,2,2,4,2,2,2,2,2,2,4,2,2,2},
            {2,2,3,2,2,2,3,2,2,2,2,3,2,2,2,2},
            {2,2,2,2,4,2,2,2,4,2,2,2,2,4,2,2},
            {2,2,3,2,2,2,3,2,2,2,3,2,2,2,3,2},
            {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
            {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
            {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
            {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
            {2,2,2,4,2,2,2,2,2,2,4,2,2,2,4,2},
            {2,2,2,2,3,2,2,2,2,3,2,2,2,3,2,2},
            {2,2,4,2,2,2,2,4,2,2,2,4,2,2,2,2},
            {2,3,2,2,2,3,2,2,2,3,2,2,2,3,2,2},
            {0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
    public level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1); 
        for(int row = 0; row < 16; row++)
        for(int col = 0; col < 16; col++)
            if(map[row][col] == 0)
                addObject(new MudGrass(), col * 50, row * 50);
            else if (map[row][col] == 1){
                addObject(new Dirt(), col * 50, row * 50);
            }
            else if (map[row][col] == 2){
                addObject(new Water1(), col * 50, row * 50);
            }
            else if (map[row][col] == 3){
                addObject(new Water1(), col * 50, row * 50);
                addObject(new Log(), col * 50, row * 50);
                setPaintOrder(Snake.class, Log.class, Log2.class, Alligator.class, Water1.class);
            }
            else if (map[row][col] == 4){
                addObject(new Water1(), col * 50, row * 50);
                addObject(new Log2(), col * 50, row * 50);
                setPaintOrder(Snake.class, Log.class, Log2.class, Alligator.class, Water1.class);
            }
                //addObject(new Road(), 375, 556);
                //addObject(new Road(), 375, 407);
                addObject(new BirdsEggs(), 375, 30);
                addObject(new Snake(), 373, 709);
                //addObject(new Log(), 375, 375);
    }
    public void act()
    {
        //if (Greenfoot.getRandomNumber(100)<1 && (counter()==3 || counter() == 6))
        //{
        //    addObject(new Alligator(), 1, 507);
        //}
        //if (Greenfoot.getRandomNumber(100)<1 && (counter()==3 || counter()==5))
        //{
        //    addObject(new Alligator(), 1, 195);
        //}
        //gettingRandomNumber();
        //spawnLogs();
        if (Greenfoot.getRandomNumber(100)<1 && (counter()==3 || counter()==5))
        {
            //addObject(new Log(), 1, 140);
        }
        counter();
        spawnAlligator();
        setPaintOrder(Snake.class, Log.class,Log2.class, Alligator.class, Water1.class);
        timer();
        playingWaterSound();
    } 
    public int counter()
    {
        if(count<=8){
            return count++;
        }
        else{
            count = 0;
            return count;
        }
    }
    public int gettingRandomNumber()
    {
        return Greenfoot.getRandomNumber(20);
    }
    public void spawnLogs(){
        if ((gettingRandomNumber() == 5 || gettingRandomNumber() == 18) && (counter()==0))
        {
            addObject(new Log(), 1, 507);
        }
    }
     public int counter2(){
        if(count2<=320){
            return count2++;
        }
        else{
            count2 = 0;
            return count2;
        }
    }
    public void spawnAlligator(){
        if (counter2()==1){
            addObject(new Alligator(), 1, 350);
        }
    }
    public void timer(){
        timerInSeconds++;
        if (timerInSeconds == 55*6 - 110){
            timerInSeconds =0;
        }
    }
    public void playingWaterSound(){
        if (timerInSeconds == 1){
            Greenfoot.playSound("WaterSound.wav");
        }
    }
}
