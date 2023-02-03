import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ArrowRight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrowRight extends Arrows
{
    private int nrArrow;
    public static int nrColor = 0;

    public static String difficulty = "einfach";
    /**
     * Act - do whatever the ArrowRight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ArrowRight(int nrArrow)
    {
        // Add your action code here.
        this.nrArrow = nrArrow;
    }

    public void changeBackground(){
        if(this.nrArrow == 2){
            if(greenfoot.Greenfoot.mouseClicked(this)){
                nrColor = nrColor + 1;

                if( nrColor == 4){
                    getWorld().getBackground().setColor(Color.BLACK);
                    nrColor = 0;

                }
                getWorld().getBackground().fill();

            }

        }

    }

    public void changeDifficulty (){

        if(this.nrArrow == 1){
            if (Greenfoot.mouseClicked(this)) {
                if(difficulty == "schwer") {
                    difficulty = "einfach";
                }
                else {
                    if(difficulty == "einfach") {
                        difficulty = "mittel";
                    }
                    else{
                        difficulty = "schwer";
                    }
                }

            }

        }
    }
}

