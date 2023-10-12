  import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

    
  
  
public class Stage extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Stage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
        this.setBackground(new GreenfootImage("sky.jpg"));
        
    }
    private void prepare()
    {

        Player player = new Player();
        addObject(player,166,503);
    }
}
