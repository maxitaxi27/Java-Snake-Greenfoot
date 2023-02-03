import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menü here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    Einzelspieler einzelspieler = new Einzelspieler();
    Mehrspieler mehrspieler = new Mehrspieler();
    Steuerung steuerung = new Steuerung();
    HighscoreButton highscoreButton = new HighscoreButton();
    
    ControlsText hText = new ControlsText();
    /**
     * Constructor for objects of class Menü.
     * 
     */
    public Menu()
    {    
        super(40, 30, 20);
           if(ArrowRight.nrColor == 0){
            getBackground().setColor(Color.BLACK);
            getBackground().fill();
        }
        else if(ArrowRight.nrColor == 1){
            getBackground().setColor(Color.DARK_GRAY);
             getBackground().fill();
        }
        else if(ArrowRight.nrColor == 2){
            getBackground().setColor(Color.GRAY);
             getBackground().fill();
        }
        else if(ArrowRight.nrColor == 3){
            getBackground().setColor(Color.LIGHT_GRAY);
             getBackground().fill();
        }

        addObject(einzelspieler, 20, 7);
        addObject(mehrspieler, 20, 13);
        addObject(steuerung, 20, 19);
        addObject(highscoreButton,20, 25);
        
        addObject(hText, 20,2);
        hText.addHeaderText();
    }
   
}
