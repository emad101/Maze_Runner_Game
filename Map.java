// this is mass class that will border the map
//Emad Al-GAilni 
//The map class
package MazeGame; // pacage name

import java.awt.*; // for the images 
import javax.swing.*; // for image
import java.util.*; // for the scanner
import java.io.*; // for the scanner 

public class Map { // class name
  
  private Scanner input; // to lead the map
  private String Map[] = new String[40]; // array to determine how many tiles will be in the maze that will block the MAze runner
  private Image black; // black image
  private Image red;   // red image
  private Image key;    //key image
  private Image door;   // door image
  private Image redDoor;  // reddoor immage
 private Image redKey;   // red key immage
  private Image finishLine;  // finsh line image
  private Image tnt;     // tnt image
  
  public String folderMap (int x , int y) // it will get the map folder from specific folder and put it into the two pramiter
  {
    String index =Map[y].substring(x, x + 1); // it uses the array to move the tiles for the game
    return index;
  }
  
  public Map(){
    
    ImageIcon img = new ImageIcon("C://maze//red.png"); //calling the red icon
    red = img.getImage();
    img = new ImageIcon("C://maze//tile.png"); //calling the black icon
    black = img.getImage();
    img = new ImageIcon("C://maze//key.png"); //calling the key icon
    key = img.getImage();
    img = new ImageIcon("C://maze//door.png"); //calling the black icon
    door = img.getImage();
    img = new ImageIcon("C://maze//redKey.png"); //calling the redkey icon
    redKey = img.getImage();
    img = new ImageIcon("C://maze//redDoor.png"); //calling the black icon
    redDoor = img.getImage();
        img = new ImageIcon("C://maze//finishLine.png"); //calling the door icon
 finishLine = img.getImage();
       img = new ImageIcon("C://maze//tnt.png"); //calling the finishlineicon
tnt = img.getImage();
    
    openMap(); // this method will open the file of the map
    readMap(); // this method will read the file of the map
    closeMap(); // this method will close the file of the map
  } // end of public map method
  
  public Image getRed() // this will call grass from boread clss
  {
    return red;
  }
  
  public Image getblack() // this will call black from boread clss
  {
    return black;
  }
  public Image getKey() // this will call the key image form the file
  {
    return key;
  }
  public Image getDoor() // this will call the door image form the file
  {
    return door;
  }
  public Image getRedKey() // this will call the redkey image form the file
  {
    return redKey;
  }
  public Image getRedDoor() // this will call the reddoorimage form the file
  {
    return redDoor;
  }
  
  public Image getFinishLine() // this will call the finish image form the file
  {
    return finishLine;
  }
    public Image getTnt() // this will call thetnt image form the file
  {
    return tnt;
  }
  public void openMap() //to open the map from the file
  {
    try { // I add try and catch because we are dealing with files and when ever thre is a erroe it will catch it 
      input =new Scanner(new File("C://maze//tutorials//Map.txt")); // file of the map 
    } catch(Exception e){
      System.out.println(" Map could not be loaded sorry, please try again"); // if the map coudnt load tell the user
    }
  }
  // for the length o the icons 
  public void readMap()
  {
    while(input.hasNext()) // to cheak that the file is in the text file 
      for(int i=0; i< 22; i++) // for loop that loop over the code and every time you add to the int i
    {
      Map[i] =input.next();// this will loead the map and when it finish from the first it goes to the second unil 14
    }
    
  }
  public void closeMap()
  {
    input.close(); // closes the file  
  }
}