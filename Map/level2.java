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
    int [][] map = 
           {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
            {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
            {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
            {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
            {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
            {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
            {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
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
                //addObject(new Road(), 375, 556);
                //addObject(new Road(), 375, 407);
                addObject(new BirdsEggs(), 375, 30);
                addObject(new Snake(), 373, 709);
    }
    public void act()
    {
        if (Greenfoot.getRandomNumber(100)<1 && (counter()==3 || counter() == 6))
        {
            addObject(new Alligator(), 1, 507);
        }
        if (Greenfoot.getRandomNumber(100)<1 && (counter()==3 || counter()==5))
        {
            addObject(new Alligator(), 1, 195);
        }
        if (Greenfoot.getRandomNumber(100)<1 && (counter()==3 || counter()==5))
        {
            //addObject(new Log(), 1, 140);
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
