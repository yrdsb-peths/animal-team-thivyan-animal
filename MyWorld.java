import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    
    public MyWorld() {
        
        // create a 600x400 world
        super(600, 400, 1, false);
        
        // create an Elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        // create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createApple();
    }

    // game over label
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    //increase score
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if (score % 3 == 0)
        {
            level += 1;
        }
    }
    
    
    // create an apple object at random location
    public void createApple()
    {
        for (int i = 0; i < level; i++)
        {
            Apple apple = new Apple();
            int x = Greenfoot.getRandomNumber(600);
            int y = 0;
            addObject(apple, x, y);
        }
    }
}