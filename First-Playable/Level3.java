import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    int [][] map = 
           {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
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
            {0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
    public Level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1);
        for(int row = 0; row < 16; row++)
        for(int col = 0; col < 16; col++)
            if(map[row][col] == 0)
                addObject(new Floor3(), col * 50, row * 50);
            else if (map[row][col] == 1){
                addObject(new Stone(), col * 50, row * 50);
            }  
            else if (map[row][col] == 2){
                addObject(new LavaLava(), col * 50, row * 50);
            }
            //else if (map[row][col] == 3){
                //addObject(new Lava(), col * 50, row * 50);
            //}
                //addObject(new Road(), 375, 533);
                //addObject(new Road(), 375, 223);
                addObject(new CanaryEggs(), 375, 30);
                addObject(new Snake(), 373, 709);
                addObject(new Rock(),Greenfoot.getRandomNumber(750),200);
                addObject(new Rock(),Greenfoot.getRandomNumber(750),300);
                addObject(new Rock(),Greenfoot.getRandomNumber(750),550);
                addObject(new Rock(),Greenfoot.getRandomNumber(750),600);
               // addObject(new Rock(), 350+Greenfoot.getRandomNumber(350),200);
                //addObject(new Rock(), 350+Greenfoot.getRandomNumber(350),200);
               // addObject(new Rock(), 350+Greenfoot.getRandomNumber(350),200);
               // addObject(new Rock(), 350+Greenfoot.getRandomNumber(350),200);
    }
}
