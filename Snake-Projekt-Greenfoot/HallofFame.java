import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HallofFame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HallofFame extends World
{
    Zurueck zurueck = new Zurueck();
    Highscore highscore = new Highscore();
    GameText highscoreHeader = new GameText();
    /**
     * Constructor for objects of class HallofFame.
     * 
     */
    public HallofFame()
    {    
        super(40, 30, 20);
        if(ArrowRight.nrColor == 0 ){
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

        addObject(zurueck,3, 2);
        
        
        try
        {
            highscore.getFileContent("Highscore.txt");
        }
        catch (java.io.IOException ioe)
        {
            ioe.printStackTrace();
        }
        highscore.showHighscoreList2(this);
        addObject(highscoreHeader,20,3);
        highscoreHeader.Highscoreheader2();

    }

    public void act(){

        if(ArrowRight.nrColor == 0 ){
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

    }
}
