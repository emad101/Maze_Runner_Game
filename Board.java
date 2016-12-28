// this class is for the borders that the hero can not go cross it
//Emad al-Gailani 
//THe borad class
package MazeGame; //Package name  
import java.awt.*; // fpr the paint and graphics 
import java.awt.event.*;// for the t
import javax.swing.*; // for the jpanals and timers, etc

public class  Board extends JPanel implements ActionListener{ //
  
  
  private Timer timer; // the timer 
  private Map input; // the map class
  private mazeHero move; // the mazeHero suction 
  private boolean win =false; // telling that the user won
  private boolean losse =false; // telling that the user lost
  private Font font = new Font ("Winner", Font.BOLD, 200); // font for the winer 
  private String Message = " " ; // winner message
  private String Losser ="";  // losser messsage
  
 public Board(){ // board method of the board class
    input =new Map();  // the map class
    move = new mazeHero(); // the maehero class
    addKeyListener(new Al()); // set the key class
    setFocusable(true); // the focusble is true 
    timer = new Timer(25, this); // every 25 seconds it will run whenClicked
    timer.start(); // to start the timer
  }
  
  public void actionPerformed(ActionEvent e)// evey time an action is preformed it will do the action
  {
    //telling that if the user won, with the lettewr of f
    if(input.folderMap(move.getTileX(), (move.getTileY())).equals("f"))
    {
      Message = "Winner";
      win =true;
      
      // tellin that the user loset with the letter of t  
    }
    if(input.folderMap(move.getTileX(), (move.getTileY())).equals("t"))
    {
      Losser = "Game Over";
      losse =true;   
      
    }    
    
    repaint(); // painting the board 
  }
  public void paint(Graphics cordinate) // for the borader cordinater
  {
    super.paint(cordinate); // super class 
    
    // this is to locate every black and red in its position of x and y   
    // if the user didnt won or lost then this will work and it is for the moving of the charecter and the main jfrmae  
    if(( !losse))
      if(!win)
    { // begin of if
      {
        
        for(int y =0; y< 22; y++) // for for the x cordinate for every x go down to the top to botton blocks which is 22 blocks
        {
          for(int x =0; x< 43; x++)  // for the y cordinate one row of y and for the arrays,which os 43 blocks
          {
            if (input.folderMap(x,y).equals("g"))
            {
              cordinate.drawImage (input.getRed(), x*32 , y*32, null); // putting the red icon in jframe
            }
            if (input.folderMap(x,y).equals("w"))
            {
              cordinate.drawImage (input.getblack(), x*32 , y*32, null); // putting the blsk icon in jframe
            }
            if (input.folderMap(x,y).equals("k"))
            {
              cordinate.drawImage (input.getKey(), x*32 , y*32, null); // putting the red icon in jframe
            }
            if (input.folderMap(x,y).equals("d"))
            {
              cordinate.drawImage (input.getDoor(), x*32 , y*32, null); // putting the red icon in jframe
            }
            if (input.folderMap(x,y).equals("r"))
            {
              cordinate.drawImage (input.getRedKey(), x*32 , y*32, null); // putting the red key in the maze
            }
            if (input.folderMap(x,y).equals("o"))
            {
              cordinate.drawImage (input.getRedDoor(), x*32 , y*32, null); // putting the red door in the maze
            }
            if (input.folderMap(x,y).equals("f"))
            {
              cordinate.drawImage (input.getFinishLine(), x*32 , y*32, null); // putting the red key in the maze
            }
            if (input.folderMap(x,y).equals("t"))
            {
              cordinate.drawImage (input.getTnt(), x*32 , y*32, null); // putting the red key in the maze
            }
          }// end of for of the lefet to right
        } // end of for from top to bottom 
      }
      cordinate.drawImage (move.getHero(), move.getTileX()*32 , move.getTileY()*32, null); // telling the charecter to move
    }
    
    // if the user win give him this messagwe
    if(win)
    {
      cordinate.setColor(Color.RED);
      cordinate.setFont(font);
      cordinate.drawString(Message , 320,400);
    }
    // if the user lose givr him this message 
    if(losse)
    {
      cordinate.setColor(Color.RED);
      cordinate.setFont(font);
      cordinate.drawString(Losser ,185,400);
    } 
  }
  //using the keys to let the user ,ove
  public class Al extends KeyAdapter
  {
    public void keyPressed(KeyEvent e)
    {
      int keyCode = e.getKeyCode();
      // using the upper key if user went up
      if (keyCode ==KeyEvent.VK_W  || keyCode == KeyEvent.VK_UP )
      {
        // this if wont allow the charecter to go throught the walls
        if(!input.folderMap(move.getTileX(),move.getTileY() -1 ).equals("w"))
        {
          move.start(0,-1); //moving direction 
        }
      }// end of up key
      // using down key if the user went doen 
      if (keyCode ==KeyEvent.VK_S || keyCode == KeyEvent.VK_DOWN)
      {
        // this if wont allow the charecter to go throught the walls
        if(!input.folderMap(move.getTileX(),move.getTileY() +1 ).equals("w"))
        { 
          move.start(0,1); // moving direction 
        }
      } // end of down key
      // using the left key if the user went left
      if (keyCode ==KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT)
      {
        // this if wont allow the charecter to go throught the walls
        if(!input.folderMap(move.getTileX()-1,move.getTileY()  ).equals("w"))
        {
          move.start(-1,0); // moving directiom
        }
      } // end of left key
      // using the wright key if the user went right
      if (keyCode ==KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT)
      {
        // this if wont allow the charecter to go throught the walls
        if(!input.folderMap(move.getTileX()+1,move.getTileY()  ).equals("w"))
        {
          {
            move.start(1,0);
          }
        }
      } // end of right key 
    } // end of keypressed method
  } // end of key adapter method
} // end Board class









