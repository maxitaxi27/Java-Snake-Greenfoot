import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mehrspieler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mehrspieler extends Buttons

{
    public static boolean mehrspieler;

    /**
     * Act - do whatever the Mehrspieler wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        mehrspieler = false;

        if(greenfoot.Greenfoot.mouseClicked(this)){
            mehrspieler = true;
            Greenfoot.setWorld(new Spielfeld(Greenfoot.ask("Wie heißt Spieler 1?"), Greenfoot.ask("Wie heißt Spieler 2")));

        }
    }
}
