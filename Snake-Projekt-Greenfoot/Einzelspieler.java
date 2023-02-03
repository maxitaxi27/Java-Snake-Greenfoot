import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Einzelspieler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Einzelspieler extends Buttons
{
    public static boolean einzelspieler;

    /**
     * Act - do whatever the Einzelspieler wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        einzelspieler = false;
        if(greenfoot.Greenfoot.mouseClicked(this)){
            einzelspieler = true;
            Greenfoot.setWorld(new Spielfeld(Greenfoot.ask("Wie ist ihr Name?"), null));

        }
    }
}
