import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{ private GreenfootImage image1 =  new GreenfootImage("snake1.png");
    private GreenfootImage image2 =  new GreenfootImage("snake2.png");
    private GreenfootImage image3 =  new GreenfootImage("snake3.png");
    private GreenfootImage image4 =  new GreenfootImage("snake4.png");
    private GreenfootImage image5 =  new GreenfootImage("snake5.png");
    private GreenfootImage image6 =  new GreenfootImage("snake6.png");
    private GreenfootImage image7 =  new GreenfootImage("snake7.png");
    private GreenfootImage image8 =  new GreenfootImage("snake8.png");
    
    
    int frame = 1;
    int skipFrame = 0;
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Snake()
    {
        (this.image1).scale(50,20);
        (this.image2).scale(50,20);
        (this.image3).scale(50,20);
        (this.image4).scale(50,20);
        (this.image5).scale(50,20);
        (this.image6).scale(50,20);
        (this.image7).scale(50,20);
        (this.image8).scale(50,20);
    }
    public void act() 
    {
        checkKeyPressed();
        skipFrame++;
        SecondLevel();
        ThirdLevel();
    }
    
    public void animate(){
        if (skipFrame % 8 == 0){
        if (frame==1){
            setImage(image2);
        } else if (frame==2){
            setImage(image3);
        } else if (frame==3){
            setImage(image4);
        } else if (frame==4){
            setImage(image5);
        } else if (frame==5){
            setImage(image6);
        } else if (frame==6){
            setImage(image7);
        } else if (frame==7){
            setImage(image8);
        } else if (frame==8){
            setImage(image1);
            frame=1;
        }
        frame++;
        }
    }
    
    public void checkKeyPressed()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            move(3);
            animate();
        }
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-5);
            animate();
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(5);
            animate();
        }
    }
    public void SecondLevel()
    {
        Actor Eggs = getOneIntersectingObject(Eggs.class);
        if (Eggs != null)
        {
            Greenfoot.setWorld(new Level2());
        }
    }
    public void ThirdLevel()
    {
        Actor BirdsEggs = getOneIntersectingObject(BirdsEggs.class);
        int Level2;
        if (BirdsEggs != null)
        {
            Greenfoot.setWorld(new Level3());
        }
    }
}
