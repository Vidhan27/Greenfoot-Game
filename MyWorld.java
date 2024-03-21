import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(764, 544, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ambulance ambulance = new Ambulance();
        addObject(ambulance,400,450);
    }
    
    public void act(){
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new Carblue(), Greenfoot.getRandomNumber(245)+255, 0);
        }
        if(Greenfoot.getRandomNumber(500)<1){
            addObject(new Carred(), Greenfoot.getRandomNumber(245)+255, 600);
        }
        if(Greenfoot.getRandomNumber(10)<2){
            addObject(new Tree(), Greenfoot.getRandomNumber(150), 0);
            addObject(new Tree(), Greenfoot.getRandomNumber(250)+640, 0);
        }
        if(Greenfoot.getRandomNumber(500)<1){
            addObject(new Coin(), Greenfoot.getRandomNumber(245)+255, 0);
        }
    }
    

}
