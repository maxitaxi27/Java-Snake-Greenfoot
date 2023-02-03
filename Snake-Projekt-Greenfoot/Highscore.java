import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.io.*;  
import java.nio.file.*;
import java.io.FileWriter;

/**
 * Write a description of class Highscore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Highscore extends Actor
{
    static ArrayList<String[]> highscoreList = new ArrayList<String[]>();
    
   
    
    public static boolean newBest = false;
    /**
     * Act - do whatever the Highscore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.

    }

    public void addHighscore(String _name, int _laenge){
        newBest = false;
        try
        {
            getFileContent("Highscore.txt");
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        for(int i = 0; i < highscoreList.size(); i++){
            if(Integer.valueOf ( highscoreList.get(i) [1] ) < _laenge){
                String[] a = {_name, String.valueOf(_laenge)};
                if(i == 0 && Sounds.soundOn){
                    Greenfoot.playSound("win.wav");
                    newBest = true;
                
                
                }
              
                highscoreList.add(i,a);
                try
                {
                    writeToFile("Highscore.txt",highscoreList);
                }
                catch (IOException ioe)
                {
                    ioe.printStackTrace();
                }
                break;
            }

        }
    }

    static public void writeToFile(String file, ArrayList<String[]> fileContent) throws IOException{
        FileWriter myWriter = new FileWriter(file);         
        for(int i = 0; i<fileContent.size(); i++){             
            myWriter.write(fileContent.get(i)[0] +": "+ fileContent.get(i)[1]+ "\n");         
        }         
        myWriter.close();    
    }

    static public void getFileContent(String file) throws java.io.IOException {         
        Scanner myScanner = new Scanner(new FileReader(file));         
        ArrayList<String> arrayList = new ArrayList<String>();         
        while(myScanner.hasNextLine()){             
            arrayList.add(myScanner.nextLine());        
        }        
        myScanner.close();
        highscoreList.clear();
        for(int i = 0; i < arrayList.size(); i++){
            highscoreList.add(arrayList.get(i).split(": " ));
        }

    }

    public void showHighscoreList(World world){
        for(int i = 0 ;i < 5; i++){
            String a = highscoreList.get(i)[0] + ": "+ highscoreList.get(i)[1];
            GameText highscoreText = new GameText();
            world.addObject(highscoreText, 28,12+ i*2);
            highscoreText.showHighscoreText(a);

        }
    }
    
     public void showHighscoreList2(World world){
        for(int i = 0 ;i < 10; i++){
            String a = highscoreList.get(i)[0] + ": "+ highscoreList.get(i)[1];
            GameText highscoreText = new GameText();
            world.addObject(highscoreText, 20,6+ i*2);
            highscoreText.showHighscoreText(a);

        }
    }
    
}
