import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{   private GreenfootImage image1 =  new GreenfootImage("snake1.png");
    private GreenfootImage image2 =  new GreenfootImage("snake2.png");
    private GreenfootImage image3 =  new GreenfootImage("snake3.png");
    private GreenfootImage image4 =  new GreenfootImage("snake4.png");
    private GreenfootImage image5 =  new GreenfootImage("snake5.png");
    private GreenfootImage image6 =  new GreenfootImage("snake6.png");
    private GreenfootImage image7 =  new GreenfootImage("snake7.png");
    private GreenfootImage image8 =  new GreenfootImage("snake8.png");
    int life=3;
    int frame = 1;
    int skipFrame = 0;
    int air = 250;
    int burn = 0;
    
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
        getImage().scale(50,20);
        setRotation(270);
    }
    public void act() 
    {
        checkKeyPressed();
        skipFrame++;
        SecondLevel();
        ThirdLevel();
        TouchingCheck();
        IsInWater();
        checkIfIsAtEdge();
        endgame();
        isOnLog();
        isOnLog2();
        touchingRock();
        worldDisplay();
        isInLava();
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
        if (Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-2);       
            setRotation(270);
            animate();
        }
        if (Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-2,getY());  
            setRotation(180);
            animate();
        }
        if (Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+2,getY());    
            setRotation(0);
            animate();
        }
        if (Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+2);  
            setRotation(90);
            animate();
        }
    }
    public void SecondLevel()
    {
        Actor SnakeEggs = getOneIntersectingObject(SnakeEggs.class);
        if (SnakeEggs != null)
        {
            Greenfoot.setWorld(new level2());
        }
    }
    public void ThirdLevel()
    {
        Actor BirdsEggs = getOneIntersectingObject(BirdsEggs.class);
        if (BirdsEggs != null)
        {
            Greenfoot.setWorld(new Level3());
            getWorld().showText("You Win", 10 ,10);
        }
    }
    public void endgame()
    {   
        Actor CanaryEggs = getOneIntersectingObject(CanaryEggs.class);
        if (CanaryEggs != null)
        {
            Greenfoot.setWorld(new GameCreditScene());
        }
    }
    public void TouchingCheck()
    {
        if (isTouching(Car.class) || isTouching(CarToLeft.class))
        {
            loseLife();
            Greenfoot.playSound("CarBreaks.wav");
        }
        if (isTouching(Car2.class) || isTouching(Car2ToLeft.class))
        {
            loseLife();
            Greenfoot.playSound("CarBreaks.wav");
        }
        if (isTouching(Car3.class) || isTouching(Car3ToLeft.class))
        {
            loseLife();
            Greenfoot.playSound("CarBreaks.wav");
        }
        if (isTouching(Ambulance.class) || isTouching(AmbulanceToLeft.class))
        {
            loseLife();
            Greenfoot.playSound("CarBreaks.wav");
        }
        if (isTouching(Pothole.class))
        {
            loseLife();
        }
        if (isTouching(Bat.class))
        {
            loseLife();
            //Greenfoot.setWorld(new Level3());
        }
        if (isTouching(Alligator.class))
        {
            loseLife();
        }
        //if (isTouching(Alligator.class)){
           // loseLife();
        //}
    }
    public void IsInWater()
    {   
        if (isTouching(Log.class)){
            air=250;
        } else if(isTouching(Water1.class)){
            air--;
        }
        if (isTouching(Log2.class)){
            air=250;
        } else if(isTouching(Water1.class)){
            air--;
        }
        if (air<=0){
            loseLife();
            air=250;
        }
    }
    public void isInLava()
    {
        if(isTouching(Rock.class)){
            burn=0;
        } else if (isTouching(LavaLava.class)){
            burn++;
        }
        if(isTouching(Rock2.class)){
            burn=0;
        } else if (isTouching(LavaLava.class)){
            burn++;
        }
        if (burn>=10){
            loseLife();
            burn=0;
            //Greenfoot.setWorld(new Level3());
        }
        if (isTouching(LavaLava.class)==false){
            burn=0;
        }
    }
    public void loseLife()
    {
        life--;
        if(life==0)
        {
            Greenfoot.stop();
            Greenfoot.setWorld(new GameOver());
        }
        setLocation(373, 709);
    }
    public void displayLife()
    {
        getWorld().showText("Lives: "+life, 100, 100);
    }
    public void checkIfIsAtEdge()
    {
        if (getX() == 0 || getX() == getWorld().getWidth()-1)
        {
            loseLife();
        }
    }
    public void isOnLog()
    {
        if (isTouching(Log.class)){
            setLocation(getX()+2,getY()); 
        }
    }
    public void isOnLog2()
    {
        if (isTouching(Log2.class)){
            setLocation(getX()-2,getY()); 
        }
    }
    public void playBgm(){
        if (this.getWorld().getClass()==Level1.class){
            Greenfoot.playSound("Level1Bgm.mp3");
        }
    }
    public void touchingRock(){
        if (isTouching(Rock.class)){
            setLocation(getX()+1,getY());
        }
    }
    public void worldDisplay(){
        if (getWorld().getClass()==level2.class){
            displayLife();
            getWorld().showText("Air: "+air, 100, 120);
        }
        if (getWorld().getClass()==Level1.class){
            displayLife();
        }
        if (getWorld().getClass()==Level3.class){
            displayLife();
            getWorld().showText("Burn: "+burn+"/10", 100, 120);
        }
    } 
    
}
