import greenfoot.*;

/**
 * Write a description of class Sounds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sounds  extends Actor
{
    // instance variables - replace the example below with your own
     public static boolean soundOn = true;
      public static int nrClick = 0;
      public static String sound = "an";
    /**
     * Constructor for objects of class Sounds
     */
    public Sounds()
    {
        this.getImage().scale(90,45);
        
        
    }

    public void switchSound(){
           
        if(greenfoot.Greenfoot.mouseClicked(this)){
            nrClick ++;
            if(nrClick == 1){
                this.setImage("soundoff.png");
                this.getImage().scale(90,45);
                soundOn = false;
                sound = "aus";
            }
            else if (nrClick == 2){
                this.setImage("soundon.png");
                this.getImage().scale(90,45);
                soundOn = true;
                nrClick = 0;
                sound = "an";
            }
        }
    }
}
