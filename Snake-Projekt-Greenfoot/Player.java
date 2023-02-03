import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.Date;

/**
 * Write a description of class Player here.
 * 
 * @author Maximilian Tarta 
 * @version 22.12.21
 */
public class Player extends Actor
{
    public int r;// Variablen zum Initialisieren der Farben in RGB
    public int g;
    public int b;
    public int nrPlayer; //Initalisieren der Steuerung, Aufrufen eines Spielers
    public int speed = 1;
    public int laenge = 0;
    public static boolean collision = false;
    public static boolean winner = false;
    //Food food;
    String name;

    GameText scoreText = new GameText();
    GameText collisionText = new GameText();
    GameText winnerText = new GameText();

    ArrayList<Tail> tailList = new ArrayList<Tail>();

    Highscore highscore = new Highscore();
    GameText highscoreHeader = new GameText();
    GameText neuerHighscoreText = new GameText();

    public Player(int nrPlayer,int r, int g , int b, String _name){

        this.r = r;
        this.g = g;
        this.b = b;
        this.nrPlayer = nrPlayer;
        this.laenge = 0;
        this.collision = false;
        this.winner = false;
        getImage().setColor(new Color(r,g,b)); 
        getImage().fill();

        name = _name;

        scoreText.setScore(laenge);

    }

    public void selecColor(int r, int g , int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public void addedToWorld(World world){
        if(nrPlayer == 1){
            getWorld().addObject(scoreText, 6, 3);
        }else{
            getWorld().addObject(scoreText, 30, 3);
        }

    }

    public void act()
    {
        // Add your action code here.

        if ( !collision ||  !Spielfeld.win){
            grow();
            scoreText.setScore(laenge);
            bewegen();

        }

        if(winner && laenge == 15){

            getWorld().addObject(winnerText,10,12);
            winnerText.winnerText(name);

            Zurueck zurueck = new Zurueck();
            getWorld().addObject(zurueck, 20, 3);

            setLocation(10,14);
            if(laenge != 15 && !collision ){

                for(Tail tail : tailList){
                    getWorld().removeObject(tail);
                }
                getWorld().removeObject(this);

            }

        }

        else if(Spielfeld.win && laenge <15 ){

            getWorld().addObject(winnerText,10,12);
            winnerText.winnerText(name);
            Spielfeld.win = false;

            Zurueck zurueck = new Zurueck();
            getWorld().addObject(zurueck, 20, 3);

            for(Tail tail : tailList){
                getWorld().removeObject(tail);
            }
            setLocation(10,14);  

        }
    }

    public void bewegen()
    {
        int anzSpieler = getWorld().getObjects(Player.class).size();

        if(this.nrPlayer == 1){ 
            if(Greenfoot.isKeyDown("a") && getRotation() != 0) {
                setRotation(180);

            }
            if(Greenfoot.isKeyDown("d") && getRotation() != 180){
                setRotation(0);

            }
            if(Greenfoot.isKeyDown("w") && getRotation() != 90) {
                setRotation(270);

            }
            if(Greenfoot.isKeyDown("s") && getRotation() != 270){
                setRotation(90); 

            }
        }

        if(this.nrPlayer == 2){ 
            if(Greenfoot.isKeyDown("left") && getRotation() != 0) {
                setRotation(180);

            }
            if(Greenfoot.isKeyDown("right") && getRotation() != 180){
                setRotation(0);

            }
            if(Greenfoot.isKeyDown("up") && getRotation() != 90) {
                setRotation(270);

            }
            if(Greenfoot.isKeyDown("down")&& getRotation() != 270){
                setRotation(90); 

            }
        }

        if(tailList.size() != 0){
            for(int i = tailList.size(); i>0; i--){
                if(i == 1){
                    tailList.get(0).setLocation(getX(), getY());
                }else
                {
                    tailList.get(i-1).setLocation(tailList.get(i-2).getX(), tailList.get(i-2).getY());
                }
            }
        }

        move(speed);

        checkCollision(name, laenge);

    }

    public void grow()
    {
        Actor food = getOneIntersectingObject(Food.class);
        if (food != null ){
            if(Sounds.soundOn){
                Greenfoot.playSound("Eat.wav");
            }
            Tail tail = new Tail(r, g, b);
            tailList.add(tail);
            getWorld().addObject(tail, getX(), getY());
            laenge ++;
            if (laenge == 15 && Mehrspieler.mehrspieler){
                winner = true;
                if(Sounds.soundOn){
                    Greenfoot.playSound("win.wav");

                }
            }

            getWorld().removeObject(food);

        }

    }

    public void checkCollision(String _name, int _laenge){
        if (getX()<1 || getX()>38 || getY()>27 || getY()<6 || getOneIntersectingObject(Tail.class) != null){

            collision = true;
            getWorld().addObject(collisionText, 10, 10);
            collisionText.collisionText(_name);

            Zurueck zurueck = new Zurueck();
            getWorld().addObject(zurueck, 20, 3);
            for(Tail tail : tailList){
                getWorld().removeObject(tail);
            }
            if(Einzelspieler.einzelspieler){
                highscore.addHighscore(_name, _laenge);
                highscore.showHighscoreList(getWorld());
                getWorld().addObject(highscoreHeader,28,10);
                highscoreHeader.Highscoreheader();

            }
            if(Highscore.newBest && !Mehrspieler.mehrspieler){
                getWorld().addObject(neuerHighscoreText,10,13);
                neuerHighscoreText.newHighscoreText();
            }
            if(Sounds.soundOn && !Highscore.newBest){
                int randomSound ;
                randomSound = 0 + Greenfoot.getRandomNumber(2);
                if(randomSound == 0 || Mehrspieler.mehrspieler){
                    Greenfoot.playSound("Kollision.wav");

                }
                if(randomSound == 1 && Einzelspieler.einzelspieler){
                    Greenfoot.playSound("Mission_failed.wav");

                }
            }
            getWorld().removeObject(this);

        }
    }

}
