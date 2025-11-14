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
    
    public void act()
    {
        int dx = 2;
        int dy = getY() + 2;
        int x = getX();
        if(Greenfoot.isKeyDown("left"))
        {
            dx = -dx;
            move(dx);
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            dx = 2;
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
        }
    }
}
