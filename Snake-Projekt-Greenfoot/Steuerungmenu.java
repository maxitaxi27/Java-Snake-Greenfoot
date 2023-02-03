import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Steuerungmenü here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Steuerungmenu extends World
{
    Zurueck zurueck = new Zurueck();

    ControlsText steuerung1 = new ControlsText();
    ControlsText steuerung2 = new ControlsText();

    ControlsText keys1 = new ControlsText();
    ControlsText keys2 = new ControlsText();

    ControlsText goal = new ControlsText();

    ControlsText backgroundText = new ControlsText();
    ControlsText speedText = new ControlsText();

    ArrowLeft arrowLs = new ArrowLeft(1);
    ArrowRight arrowRs = new ArrowRight(1);

    ArrowLeft arrowLb = new ArrowLeft(2);
    ArrowRight arrowRb = new ArrowRight(2);

    ControlsText dcText = new ControlsText();

    Sounds soundb = new Sounds();
    ControlsText sText = new ControlsText();

    /**
     * Constructor for objects of class Steuerungmenü.
     * 
     */
    public Steuerungmenu()
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
        addObject(steuerung1, 10, 6);
        steuerung1.addSteuerung(1);
        addObject(keys1,10,8);
        keys1.addKeys(1);

        addObject(steuerung2,30,6);
        addObject(keys2,30,8);
        steuerung2.addSteuerung(2);
        keys2.addKeys(2);

        addObject(goal, 20,27);
        goal.addGoalText();

        addObject(backgroundText, 31,15);
        backgroundText.addChangeBackgroundText();

        addObject(speedText, 9,15);
        speedText.addChangeSpeedText();

        addObject(arrowLs, 6, 17);
        addObject(arrowRs, 11, 17);
        addObject(dcText, 8, 20);

        addObject(arrowLb, 28, 17);
        addObject(arrowRb, 33, 17);

        dcText.addChangeDCText();

        if(Sounds.nrClick == 1){
            soundb.setImage("soundoff.png");
            soundb.getImage().scale(90,45);
        }
        if(Sounds.nrClick == 2){
            soundb.setImage("soundon.png");
            soundb.getImage().scale(90,45);
        }
        addObject(soundb, 35, 22);
        addObject(sText, 29, 22);

        sText.addChangeSText();

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
        arrowLb.changeBackground();
        arrowRb.changeBackground();

        arrowRs.changeDifficulty();
        arrowLs.changeDifficulty();
        dcText.addChangeDCText();

        soundb.switchSound();
        sText.addChangeSText();
    }
}
