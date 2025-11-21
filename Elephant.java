import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound elephantSound = new GreenfootSound("elephant-trumpets-growls-6047.mp3");
    
    GreenfootImage idle = new GreenfootImage("images/elephant_idle/tile000.png");
    
    public Elephant()
    {
        setImage(idle);
    }
    
    public void act()
    {
        int dx = 4;
        int dy = getY() + 2;
        int x = getX();
        if(Greenfoot.isKeyDown("left"))
        {
            dx = -dx;
            move(dx);
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            dx = dx;
            move(dx);
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(0, dy);
        }
        
        eat();
    }
    
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(null);
            MyWorld world = (MyWorld) getWorld();
            world.spawnApple();
            world.increaseScore();
            elephantSound.play();
        }
    }
}
