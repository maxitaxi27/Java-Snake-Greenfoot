import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Border here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Border extends Actor
{
    /**
     * Act - do whatever the Border wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }

    GreenfootImage rectangle = new GreenfootImage(800,600);
    public Border(){

        rectangle.setColor(new Color(255,255,255));
        rectangle.drawRect(10,10,760,440); 

        setImage(rectangle);

    }
}
