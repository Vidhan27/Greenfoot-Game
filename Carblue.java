import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carblue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carblue extends Parent
{
    int speed = 3;
   
    public void act()
    {
        Carblue a = new Carblue();
        Actor i = getOneIntersectingObject(Carblue.class);
        move(speed);
        checkdouble(i);
        end();
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    
}
