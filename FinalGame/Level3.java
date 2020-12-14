
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
    private int timerForSound = 0;
    int [][] map = 
           {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {2,2,2,2,3,2,2,2,2,3,2,2,2,2,2,2},
            {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
            {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
            {2,2,3,2,2,2,2,2,2,2,2,2,2,3,2,2},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {2,2,2,3,2,2,2,2,2,2,2,3,2,2,2,2},
            {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
            {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
            {2,2,2,2,2,2,3,2,2,2,2,2,2,2,3,2},
            {0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
    private int count = 0;
    public Level3() //consntructor for level 3
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
            else if (map[row][col] == 3){
                addObject(new LavaLava(), col * 50, row * 50);
                addObject(new Rock(), col * 50, row * 50); 
                setPaintOrder(Border.class, Bat.class,Snake.class,Rock2.class,Rock.class);
            }
            //else if (map[row][col] == 3){
                //addObject(new Lava(), col * 50, row * 50);
            //}
                addObject(new CanaryEggs(), 375, 30);
                addObject(new Snake(), 373, 709);
                addObject(new Bat(),0,0);
                addObject(new Bat(),0,0);
                addObject(new Bat(),0,0);
                addObject(new Bat(),750,0);
                addObject(new Bat(),750,0);
                addObject(new Bat(),750,0);
                addObject(new Rock2(),Greenfoot.getRandomNumber(375),275);
                addObject(new Rock2(),375+Greenfoot.getRandomNumber(375),275);
                addObject(new Rock2(),Greenfoot.getRandomNumber(375),575);
                addObject(new Rock2(),375+Greenfoot.getRandomNumber(375),575);
               //addObject(new Rock(),+Greenfoot.getRandomNumber(375),650);
                //addObject(new Rock(),375+Greenfoot.getRandomNumber(375),500);
                //addObject(new Rock(),Greenfoot.getRandomNumber(375),350);
                //addObject(new Rock(),375+Greenfoot.getRandomNumber(375),200);
               // addObject(new Rock(), 350+Greenfoot.getRandomNumber(350),200);
                //addObject(new Rock(), 350+Greenfoot.getRandomNumber(350),200);
               // addObject(new Rock(), 350+Greenfoot.getRandomNumber(350),200);
               // addObject(new Rock(), 350+Greenfoot.getRandomNumber(350),200);
               Border border = new Border();
                addObject(border, 0, 375);
                Border border2 = new Border();
                addObject(border2, 750, 375);
    }
    public void act(){ //act method
        timer();
        batsChitteringAndLavaSound();
        setPaintOrder(Border.class, Bat.class,Snake.class,Rock2.class,Rock.class);
    }
    public void timer(){ //timer method
        timerForSound++;
        if (timerForSound == 198){
            timerForSound = 0;
        }
    }
    public void batsChitteringAndLavaSound(){ //Sound effects in level 3
        if (timerForSound ==1){
            Greenfoot.playSound("BatsChittering.wav");
            Greenfoot.playSound("LavaSoundEffect.wav");
        }
    }
    //public void spawnMovingRock()
    //{
        //counter();
        //if (counter()==1)
        //{
            //if(gettingRandomNumber()==2){
                //addObject(new Rock(),1,200);
            //}
            //if(gettingRandomNumber()==2){
                //addObject(new Rock(),1,350);
            //}
            //if(gettingRandomNumber()==2){
                //addObject(new Rock(),1,500);
            //}
            //if(gettingRandomNumber()==2){
                //addObject(new Rock(),1,650);
            //}
        //}
    //}
    public int counter(){
        if(count<=15){
            return count++;
        }
        else{
            count = 0;
            return count;
        }
    }
    public int gettingRandomNumber() //random number generator from 1-20
    {
        return Greenfoot.getRandomNumber(20);
    }
}
