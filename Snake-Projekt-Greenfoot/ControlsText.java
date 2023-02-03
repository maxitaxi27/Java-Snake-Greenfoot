import greenfoot.Actor;
import greenfoot.*;
/**
 * Write a description of class ControlsText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlsText extends Actor 
{
    int nr;

    public void addSteuerung(int nr){

        setImage(new GreenfootImage("Steuerung Spieler " + nr,25, Color.WHITE, null));

    }

    public void addKeys(int nr){

        if(nr == 1){
            setImage(new GreenfootImage("w ; a ; s ; d (auch im Einzelspieler)",25, Color.WHITE, null));

        }
        else {

            setImage(new GreenfootImage("Pfeiltasten ",25, Color.WHITE, null));
        }

    }

    public void addGoalText(){
        setImage(new GreenfootImage("Im Mehrspieler: Spieler der 15 Punkte hat oder nicht kollidiert, gewinnt",25, Color.WHITE, null));
    }

    public void addChangeBackgroundText(){

        setImage(new GreenfootImage("Hintergrundfarbe ändern",25, Color.WHITE, null));

    }
    public void addChangeSpeedText(){
        setImage(new GreenfootImage("Speed ändern (nur Einzelspieler)",25, Color.WHITE, null));
    
    }

    public void addChangeDCText(){

        setImage(new GreenfootImage("Schwierigkeit = " + ArrowRight.difficulty,25, Color.WHITE, null));

    }
    
    public void addChangeSText(){

        setImage(new GreenfootImage("Ton = " + Sounds.sound,25, Color.WHITE, null));

    }
    
    public void addHeaderText(){
    
        setImage(new GreenfootImage("Snake",40, Color.WHITE, null));
    
    }
}
