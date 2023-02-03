import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tail extends Actor
{
    public int r,g,b;

    public int nrPlayer; 
    public int speed = 1;
    public Tail(int r, int g , int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        GreenfootImage tail = getImage();
        tail.scale(20,20);
        getImage().setColor(new Color(r,g -70,b -70 )); 
        getImage().fillRect(0,0,20, 20); 

    }  

}
