import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food extends Actor
{

    public Food(){
        GreenfootImage apple = getImage();
        apple.scale(20,20);

    }

    
    public void act(){

        if(Spielfeld.win || Player.collision){
            getWorld().removeObject(this);
        }
    }
}
