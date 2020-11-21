import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    private int count = 0;
    int [][] map = 
           {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1); 
        for(int row = 0; row < 16; row++)
        for(int col = 0; col < 16; col++)
            if(map[row][col] == 0)
                addObject(new Grass(), col * 50, row * 50);
            else if (map[row][col] == 1){
                addObject(new Desert(), col * 50, row * 50);
            }
                addObject(new Road(), 375, 533);
                addObject(new Road(), 375, 223);
                addObject(new SnakeEggs(), 375, 30);
                addObject(new Snake(), 373, 709);
    }
    public void act()
    {
        if (Greenfoot.getRandomNumber(100)<1 && (counter()==3 || counter() == 6))
        {
            addObject(new Car(), 1, 507);
        }
        /*if (Greenfoot.getRandomNumber(100)<1 && (counter()==1 || counter()==4
                || counter() == 7))
        {
            addObject(new Car(), 1, 110);
        }*/
        if (Greenfoot.getRandomNumber(100)<1 && (counter()==3 || counter()==5))
        {
            addObject(new Car(), 1, 195);
        }
        if (Greenfoot.getRandomNumber(100)<1 && (counter()==0 || counter()==4))
        {
            addObject(new CarToLeft(), 749, 561);
        }
        /*if (Greenfoot.getRandomNumber(100)<1 && (counter()==1 || counter() ==4
                || counter() == 8))
        {
            addObject(new CarToLeft(), 749, 230);
        }*/
        if (Greenfoot.getRandomNumber(100)<1 && (counter()==0 || counter()==4))
        {
            addObject(new CarToLeft(), 749, 250);
        }
        counter();
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
}
    


