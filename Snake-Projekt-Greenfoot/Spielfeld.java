import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spielfeld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spielfeld extends World
{
    public static int laenge = 0;
    public static boolean win = false;

    GameText player1Name; 
    GameText player2Name;

    Border border = new Border();
    /**
     * Constructor for objects of class Spielfeld.
     * 
     */
    public Spielfeld(String name1, String name2)
    {    
        super(40,30,20);

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

        Player player1 = new Player (1,0,255,70,name1);
        Player player2 = new Player (2,0,70,255,name2);

        addObject(border, 20, 20);       
        if(Einzelspieler.einzelspieler){
            player1Name = new GameText(name1);
            addObject(player1Name,6,1);
            addObject(player1, 6,25);

        }      
        if(Mehrspieler.mehrspieler){
            player1Name = new GameText(name1);
            player2Name = new GameText(name2);
            addObject(player1, 6,25);   
            addObject(player2, 20,25);

            addObject(player1Name,6,1);
            addObject(player2Name,30,1);
        }

        setPaintOrder(Zurueck.class,Border.class, Player.class, Tail.class);
    }

    public void act (){
        laenge = 0;
        win = false;     
        int anzSpieler = getObjects(Player.class).size();

        if(Einzelspieler.einzelspieler){
            if(ArrowRight.difficulty == "einfach"){
                Greenfoot.setSpeed(39); 

            }
            if(ArrowRight.difficulty == "mittel"){
                Greenfoot.setSpeed(42); 

            }
            if(ArrowRight.difficulty == "schwer"){
                Greenfoot.setSpeed(44); 
            }
            spawn();
        }
        
        if(Mehrspieler.mehrspieler){
            Greenfoot.setSpeed(39);
            spawn();
            checkWin();
        }
    }

    public void spawn(){
        int anzFood = getObjects(Food.class).size();
        if(anzFood < 2 && Mehrspieler.mehrspieler){
            Food food = new Food();
            addObject(food,1 + Greenfoot.getRandomNumber(38), 6 + Greenfoot.getRandomNumber(22));
        }
        else if(anzFood < 1 && Einzelspieler.einzelspieler){
            Food food = new Food();
            addObject(food,1 + Greenfoot.getRandomNumber(38), 6 + Greenfoot.getRandomNumber(22));
        }
    }

    public void checkWin(){
        int anzSpieler = getObjects(Player.class).size();
        if(Mehrspieler.mehrspieler ){
            if(anzSpieler < 2){
                win = true;

                
            }
        }
    }
}
