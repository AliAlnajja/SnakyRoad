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
    public Level1() //Consctructor for level1
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
        addObject(new Pothole(), 350+Greenfoot.getRandomNumber(350),200);
        addObject(new Pothole(), Greenfoot.getRandomNumber(350),190);
        addObject(new Pothole(), 350+Greenfoot.getRandomNumber(350),263);
        addObject(new Pothole(), Greenfoot.getRandomNumber(350),263);
        addObject(new Pothole(), 350+Greenfoot.getRandomNumber(350), 510);
        addObject(new Pothole(), Greenfoot.getRandomNumber(350), 500);
        addObject(new Pothole(), 350+Greenfoot.getRandomNumber(350), 573);
        addObject(new Pothole(), Greenfoot.getRandomNumber(350), 573);
        prepare();
                Border border = new Border();
                addObject(border, 0, 375);
                Border border2 = new Border();
                addObject(border2, 750, 375);
    }
    public void act() //Act method for level 1
    {
        counter();
        spawnCar();
        spawnCar2();
        spawnCar3();
        spawnAmbulance();
        gettingRandomNumber();
        setPaintOrder(Border.class);
    } 
    public int counter()
    { // 825 would be around 55 cycles per second multiplied by 30 seconds, so this counter is about 15 seconds
        if(count<=825){
            return count++;
        }
        else{         
            count = 0;
            return count;
        }
    }
    public void spawnCar() //Method for randomly spawning car1
    {
        if (/*(gettingRandomNumber() == 5 || gettingRandomNumber() == 8) &&*/ (counter()==57))
        {
            addObject(new Car(), 1, 507);
            Greenfoot.playSound("CarHorn03.wav");
        }
        if (/*(gettingRandomNumber() == 7 || gettingRandomNumber() == 8) &&*/ (counter()==350))
        {
            addObject(new Car(), 1, 195);
            Greenfoot.playSound("CarHorn03.wav");
        }
        if (/*(gettingRandomNumber() == 7 || gettingRandomNumber() == 8) && */(counter()==820))
        {
            addObject(new CarToLeft(), 749, 570);
            Greenfoot.playSound("CarHorn03.wav");
        }
        if (/*(gettingRandomNumber() == 3 || gettingRandomNumber() == 1) && */(counter()==75))
        {
            addObject(new CarToLeft(), 749, 255);
            Greenfoot.playSound("CarHorn03.wav");
        }
    }
    public void spawnCar2() //method for randomly spawning car2
    {
        if (/*(gettingRandomNumber() == 6 || gettingRandomNumber() == 7) &&*/ (counter()==310))
        {
            addObject(new Car2(), 1, 507);
            Greenfoot.playSound("CarHorn03.wav");
        }
        if (/*(gettingRandomNumber() == 3 || gettingRandomNumber() == 4) &&*/ (counter()==75))
        {
            addObject(new Car2(), 1, 195);
            Greenfoot.playSound("CarHorn03.wav");
        }
        if (/*(gettingRandomNumber() == 1 || gettingRandomNumber() == 2) &&*/ (counter()==550))
        {
            addObject(new Car2ToLeft(), 749, 570);
            Greenfoot.playSound("CarHorn03.wav");
        }
        if (/*(gettingRandomNumber() == 0 || gettingRandomNumber() == 5) && */(counter()==550))
        {
            addObject(new Car2ToLeft(), 749, 255);
            Greenfoot.playSound("CarHorn03.wav");
        }
    }

    public void spawnCar3() //method for randonly spawning car3
    {
        if (/*(gettingRandomNumber() == 3 || gettingRandomNumber() == 4) &&*/ (counter()==500))
        {
            addObject(new Car3(), 1, 507);
            Greenfoot.playSound("CarHorn03.wav");
        }
        if (/*gettingRandomNumber() < 2 &&*/ (counter()==750))
        {
            addObject(new Car3(), 1, 195);
            Greenfoot.playSound("CarHorn03.wav");
        }
        if (/*(gettingRandomNumber() == 3 || gettingRandomNumber() == 4) &&*/ (counter()==75))
        {
            addObject(new Car3ToLeft(), 749, 570);
            Greenfoot.playSound("CarHorn03.wav");
        }
        if (/*(gettingRandomNumber() == 6 || gettingRandomNumber() == 9) &&*/ (counter()==750))
        {
            addObject(new Car3ToLeft(), 749, 255);
            Greenfoot.playSound("CarHorn03.wav");
        }
    }
     public void spawnAmbulance() //method for randonly spawning ambulances
    {
        if (/*gettingRandomNumber() < 2 &&*/ (counter()==700))
        {
            addObject(new Ambulance(), 1, 507);
            Greenfoot.playSound("AmbulanceSiren.wav");
        }
        if (/*(gettingRandomNumber() == 5 || gettingRandomNumber() == 6) &&*/ (counter()==500))
        {
            addObject(new Ambulance(), 1, 195);
            Greenfoot.playSound("AmbulanceSiren.wav");
        }
        if (/*(gettingRandomNumber() == 5 || gettingRandomNumber() == 6) && */(counter()==350))
        {
            addObject(new AmbulanceToLeft(), 749, 570);
            Greenfoot.playSound("AmbulanceSiren.wav");
        }
        if (/*(gettingRandomNumber() == 4 || gettingRandomNumber() == 8) &&*/ (counter()==350))
        {
            addObject(new AmbulanceToLeft(), 749, 255);
            Greenfoot.playSound("AmbulanceSiren.wav");
        }
    }
    public int gettingRandomNumber() //Random number generator for 1-10
    {
        return Greenfoot.getRandomNumber(10);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        AmbulanceToLeft ambulanceToLeft = new AmbulanceToLeft();
        addObject(ambulanceToLeft,717,579);
        Car2ToLeft car2ToLeft = new Car2ToLeft();
        addObject(car2ToLeft,291,579);
        Car3 car3 = new Car3();
        addObject(car3,45,502);
        CarToLeft carToLeft = new CarToLeft();
        addObject(carToLeft,710,262);
        Car car = new Car();
        addObject(car,37,190);
        AmbulanceToLeft ambulanceToLeft2 = new AmbulanceToLeft();
        addObject(ambulanceToLeft2,161,264);
    }
}
    


