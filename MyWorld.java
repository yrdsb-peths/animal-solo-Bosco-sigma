import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        Label scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 20, 20);
        
        spawnApple();
    }
    
    public void increaseScore()
    {
        
    }
    
    public void spawnApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        
        addObject(apple, x, y);
    }
}
