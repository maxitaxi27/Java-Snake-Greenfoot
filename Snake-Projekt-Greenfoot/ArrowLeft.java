import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ArrowLeft here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrowLeft extends Arrows
{
    private int nrArrow;
    
    /**
     * Act - do whatever the ArrowLeft wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ArrowLeft(int nrArrow)
    {
        // Add your action code here.
        setRotation(180);
        this.nrArrow = nrArrow;
    }


    public void changeBackground(){
        if(this.nrArrow == 2){
            if(greenfoot.Greenfoot.mouseClicked(this)){
                ArrowRight.nrColor = ArrowRight.nrColor - 1;
                if(ArrowRight.nrColor < 0){
                    ArrowRight.nrColor = 3;
                
                }

            }
        }
    }
    
      public void changeDifficulty (){

        if(this.nrArrow == 1){
            if (Greenfoot.mouseClicked(this)) {
                if(ArrowRight.difficulty == "einfach") {
                    ArrowRight.difficulty = "schwer";
                }
                else {
                    if(ArrowRight.difficulty == "schwer") {
                        ArrowRight.difficulty = "mittel";
                    }
                    else{
                        ArrowRight.difficulty = "einfach";
                    }
                }
                
            }

        }
    }
}
