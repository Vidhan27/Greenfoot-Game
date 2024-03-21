import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ambulance extends Actor
{
    int score =0;
    int lives = 3;
    public void act()
    {
       getWorld().showText("Score :"+score , 70 , 30);
       getWorld().showText("Lives :"+lives , 70 , 50);
       checkKey();
       end();
       addScore();
       gameOver();
    }
public void checkKey() {
    if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("A")) {
        if (getX() >= 255) {
            setLocation(getX() - 3, getY());
        }
    }
    if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("D")) {
        if (getX() <= 500) {
            setLocation(getX() + 3, getY());
        }
    }
    if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("W")) {
        setLocation(getX(), getY() - 3);
    }
    if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("S")) {
        setLocation(getX(), getY() + 3);
    }
}
        public void end(){
        if(isTouching(Carblue.class)||isTouching(Carred.class)){
            removeTouching(Parent.class);
            if (--lives<=0){
                getWorld().showText("Game Over \n Score:"+score , 410 , 400);
                getWorld().addObject(new GameOver(), 764/2,554/2);
                Greenfoot.stop();
            }
        }
    }
    public void addScore(){
        if(isTouching(Coin.class)){
            score = score + 20;
            removeTouching(Coin.class);
        }
    }
    public void gameOver()
    {
        if(score==200)
        {
            getWorld().showText("you win",410,400);
            Greenfoot.stop();
        }
    }
}
