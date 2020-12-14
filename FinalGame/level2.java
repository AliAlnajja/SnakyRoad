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
    public level2() //Constructor for level 2
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
                setPaintOrder(Border.class, Snake.class, Log.class, Log2.class, Alligator.class, Water1.class);
            }
            else if (map[row][col] == 4){
                addObject(new Water1(), col * 50, row * 50);
                //addObject(new Log2(), col * 50, row * 50);
                setPaintOrder(Border.class, Snake.class, Log.class, Log2.class, Alligator.class, Water1.class);
            }
                addObject(new BirdsEggs(), 375, 30);
                addObject(new Snake(), 373, 709);
                Border border = new Border();
                addObject(border, 0, 375);
                Border border2 = new Border();
                addObject(border2, 750, 375);
    }
    public void act() //act method for level 2
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
        counter();
        spawnAlligator();
        setPaintOrder(Border.class, Snake.class, Log.class,Log2.class, Alligator.class, Water1.class);
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
    public int gettingRandomNumber() //random number generator for 1-20
    {
        return Greenfoot.getRandomNumber(20);
    }
    public int counter2(){
        if(count2<=400){
            return count2++;
        }
        else{
            count2 = 0;
            return count2;
        }
    }
    public void spawnAlligator2(){ //spawning alligators depending on the counter2 method
        if (counter2()==1){
            addObject(new Alligator(), 1, 300);
        }
    }
    public void spawnAlligator1(){ //spawning alligators depending on the counter1 method
        if (counter2()==200){
            addObject(new Alligator(), 1, 425);
        }
    }
    public void spawnAlligator(){ //spawning alligators depending on the 2 spawning alligator methods
        spawnAlligator1();
        spawnAlligator2();
    }
    public void timer(){ //timer method
        timerInSeconds++;
        if (timerInSeconds == 55*6 - 110){
            timerInSeconds =0;
        }
    }
    public void playingWaterSound(){ //Playing sound of water
        if (timerInSeconds == 1){
            Greenfoot.playSound("WaterSound.wav");
        }
    }
}
