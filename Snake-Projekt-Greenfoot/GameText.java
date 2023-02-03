import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerName here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameText extends Actor
{
    public String name;

    public GameText(){

    }

    public GameText(String _name){
        name = _name;
        setImage(new GreenfootImage("Player: "+ name,25, Color.WHITE,null));

    }

    public void setScore(int laenge){
        setImage(new GreenfootImage("Score: "+ laenge,25, Color.WHITE, null));
    }

    public void collisionText(String _name){
        setImage(new GreenfootImage(_name + " hatte einen Unfall",30, Color.WHITE, null));

    }

    public void winnerText(String _name){
        setImage(new GreenfootImage(_name + " hat gewonnen",30, Color.WHITE, null));

    }
    
    public void showHighscoreText(String _a){
        setImage(new GreenfootImage(_a ,25, Color.WHITE, null));
        
    }
    
    public void Highscoreheader(){
        setImage(new GreenfootImage("Highscores" ,30, Color.WHITE, null));
    
    }
    
     public void Highscoreheader2(){
        setImage(new GreenfootImage("Top 10" ,35, Color.WHITE, null));
    
    }
    
    public void newHighscoreText(){
        setImage(new GreenfootImage("Neuer Highscore!" ,35, Color.WHITE, null));
    
    }
}