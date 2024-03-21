import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Coin extends Parent
{
    int speed = 3;
    public void act()
    {
         Coin a = new Coin();
         Actor i = getOneIntersectingObject(Coin.class);
         move(speed);
         checkdouble(i);
         end();
          if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
