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
        if (Greenfoot.getRandomNumber(75)<20 && (counter()==67))
        {
            addObject(new Car(), 1, 507);
        }
        if (Greenfoot.getRandomNumber(75)<20 && (counter()==91))
        {
            addObject(new Car(), 1, 195);
        }
        if (Greenfoot.getRandomNumber(75)<20 && (counter()==36))
        {
            addObject(new CarToLeft(), 749, 570);
        }
        if (Greenfoot.getRandomNumber(75)<20 && (counter()==74))
        {
            addObject(new CarToLeft(), 749, 255);
        }
    }
    public void spawnCar2()
    {
        if (Greenfoot.getRandomNumber(75)>55 && (counter()==87))
        {
            addObject(new Car2(), 1, 507);
        }
        if (Greenfoot.getRandomNumber(75)>55 && (counter()==96))
        {
            addObject(new Car2(), 1, 195);
        }
        if (Greenfoot.getRandomNumber(75)>55 && (counter()==64))
        {
            addObject(new Car2ToLeft(), 749, 570);
        }
        if (Greenfoot.getRandomNumber(75)>55 && (counter()==56))
        {
            addObject(new Car2ToLeft(), 749, 255);
        }
    }
    public void spawnCar3()
    {
        if (Greenfoot.getRandomNumber(95)>75 && (counter()==75))
        {
            addObject(new Car3(), 1, 507);
        }
        if (Greenfoot.getRandomNumber(95)>75 && (counter()==68))
        {
            addObject(new Car3(), 1, 195);
        }
        if (Greenfoot.getRandomNumber(95)>75 && (counter()==74))
        {
            addObject(new Car3ToLeft(), 749, 570);
        }
        if (Greenfoot.getRandomNumber(95)>75 && (counter()==50))
        {
            addObject(new Car3ToLeft(), 749, 255);
        }
    }
    public void spawnAmbulance()
    {
        if (Greenfoot.getRandomNumber(115)>95 && (counter()==5))
        {
            addObject(new Ambulance(), 1, 507);
        }
        if (Greenfoot.getRandomNumber(115)>95 && (counter()==18))
        {
            addObject(new Ambulance(), 1, 195);
        }
        if (Greenfoot.getRandomNumber(115)>95 && (counter()==46))
        {
            addObject(new AmbulanceToLeft(), 749, 570);
        }
        if (Greenfoot.getRandomNumber(115)>95 && (counter()==88))
        {
            addObject(new AmbulanceToLeft(), 749, 255);
        }
    }
}
    


