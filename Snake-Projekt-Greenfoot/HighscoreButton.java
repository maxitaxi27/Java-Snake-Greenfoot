import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HighscoreButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HighscoreButton extends Buttons
{
    /**
     * Act - do whatever the HighscoreButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(greenfoot.Greenfoot.mouseClicked(this)){
           
            Greenfoot.setWorld(new HallofFame());

        }
    }
}
