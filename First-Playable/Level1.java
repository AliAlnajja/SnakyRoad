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
         counter();
         spawnCar();
         spawnCar2();
         spawnCar3();
         spawnAmbulance();
         gettingRandomNumber();
    } 
    public int counter()
    {
        if(count<=100){
            return count++;
        }
        else{         
            count = 0;
            return count;
        }
    }
    public void spawnCar()
    {
        if ((gettingRandomNumber() == 5 || gettingRandomNumber() == 18) && (counter()==0))
        {
            addObject(new Car(), 1, 507);
        }
        if ((gettingRandomNumber() == 7 || gettingRandomNumber() == 18) && (counter()==74))
        {
            addObject(new Car(), 1, 195);
        }
        if ((gettingRandomNumber() == 0 || gettingRandomNumber() == 8) && (counter()==0))
        {
            addObject(new CarToLeft(), 749, 570);
        }
        if ((gettingRandomNumber() == 3 || gettingRandomNumber() == 4) && (counter()==24))
        {
            addObject(new CarToLeft(), 749, 255);
        }
    }
    public void spawnCar2()
    {
        if ((gettingRandomNumber() == 16 || gettingRandomNumber() == 17) && (counter()==25))
        {
            addObject(new Car2(), 1, 507);
        }
        if ((gettingRandomNumber() == 13 || gettingRandomNumber() == 4) && (counter()==99))
        {
            addObject(new Car2(), 1, 195);
        }
        if ((gettingRandomNumber() == 1 || gettingRandomNumber() == 12) && (counter()==74))
        {
            addObject(new Car2ToLeft(), 749, 570);
        }
        if ((gettingRandomNumber() == 0 || gettingRandomNumber() == 5) && (counter()==99))
        {
            addObject(new Car2ToLeft(), 749, 255);
        }
    }
    public void spawnCar3()
    {
        if ((gettingRandomNumber() == 3 || gettingRandomNumber() == 14) && (counter()==75))
        {
            addObject(new Car3(), 1, 507);
        }
        if (gettingRandomNumber() < 2 && (counter()==25))
        {
            addObject(new Car3(), 1, 195);
        }
        if ((gettingRandomNumber() == 3 || gettingRandomNumber() == 4) && (counter()==99))
        {
            addObject(new Car3ToLeft(), 749, 570);
        }
        if ((gettingRandomNumber() == 6 || gettingRandomNumber() == 9) && (counter()==0))
        {
            addObject(new Car3ToLeft(), 749, 255);
        }
    }
    public void spawnAmbulance()
    {
        if (gettingRandomNumber() < 2 && (counter()==50))
        {
            addObject(new Ambulance(), 1, 507);
        }
        if ((gettingRandomNumber() == 5 || gettingRandomNumber() == 6) && (counter()==50))
        {
            addObject(new Ambulance(), 1, 195);
        }
        if ((gettingRandomNumber() == 15 || gettingRandomNumber() == 16) && (counter()==49))
        {
            addObject(new AmbulanceToLeft(), 749, 570);
        }
        if ((gettingRandomNumber() == 17 || gettingRandomNumber() == 18) && (counter()==49))
        {
            addObject(new AmbulanceToLeft(), 749, 255);
        }
    }
    public int gettingRandomNumber()
    {
        return Greenfoot.getRandomNumber(20);
    }
}
    


