import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zurück here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zurueck extends Actor
{

    /**
     * Act - do whatever the Zurück wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
        if(greenfoot.Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Menu());
            
        }
         
    }
    
    public Zurueck(){
        
        this.getImage().scale(110,55);
            
    
    }
}
