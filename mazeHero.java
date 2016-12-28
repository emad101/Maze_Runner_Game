//EMad Al-GAilan i
//THe mazeHEro class
package MazeGame; //Package name
import java.awt.*; // for the images 
import javax.swing.*; // for image

public class mazeHero { // class namet

  
  int tileX; // tile x for the wall of x
  int tileY; // for the wall of y
   private Image hero;  // for the hero image
   
    public mazeHero()  // charecter classs
  {
     ImageIcon img = new ImageIcon("C://maze//hero.png"); //calling the hero icon
    hero = img.getImage();  
 
      tileX=1; //the hero will begin from the first tile of x
      tileY=1; // the hero will begin from the first tiel of y
    }
    // returnin hero the the main class
      public Image getHero()
      {
       return hero; 
      }
      // returnin x cordinate to the main class
    
         // returnin tile x cordinate to the main class
          public int getTileX()
      {
        return tileX;
      }
           // returnin tile y cordinate to the main class
            public int getTileY()
      {
        return tileY;
      }
      // counting the number of walking
    public void start( int xa, int ya)// if the x is possitive we go right and if it nagitive we go lef, if y is positive we go up and if y is nagitive we go down
    {
       tileX += xa; // for the charecteer move
        tileY +=ya; // for the charecter move
    } // end of start method 
  }// end of class
