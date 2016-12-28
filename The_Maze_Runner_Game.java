//Emad Al-Gailani
//The maze Runner Class
package MazeGame; //Package name
import javax.swing.*; // for the Jframe
import javax.swing.JButton; // for the buttons
import java.awt.event.ActionEvent; // action listner 
import java.awt.event.ActionListener; // action listner

public class The_Maze_Runner_Game // main class
{  // beginging of the class
public JFrame Mazeboard;

  // begining of the program
// main method 
  public static void main(String[] args)throws Exception // throws exception is for images
  { // beginning of the main  progrma
   
    // the buttons are fo the intruduction screen to play rule and about 
    final JFrame puzzleGame = new JFrame(); 
    JButton begin = new JButton("begin the game");
    begin.setBounds(455, 250, 400, 50);
    JButton about = new JButton("About");
    about.setBounds(455, 330, 400, 50);
    JButton rules = new JButton("Rules");
    rules.setBounds(455, 410, 400, 50);
    // action listener for begin button 
    begin.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e ) {
        puzzleGame.setVisible (false);
        MazeGame();// the frame for the maze game 
      }
    });
    // action listener for about button 
    about.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e ) {
        JOptionPane.showMessageDialog(null,"The maker of the game is Emad Al-Gailani\n\t\t                   Virsion 1.0");
        return;
      }
    });
    // action listner for rule button
    rules.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e ) {
        JOptionPane.showMessageDialog(null,"Are you ready for the maze runner Game\nYou have to go through the Maze to the finsh line,\nMake sure to not step in the bombs, because\nif you did you will die\n\nYour mision os to help the Dragon and take him to the finsh Line\n");
        return;
      }
    });
    // the things that jframe need hight pictures and etc
    puzzleGame.setContentPane(new JLabel(new ImageIcon("C://maze//mazePic.jpg")));
    puzzleGame.add(begin);
    puzzleGame.add(about);
    puzzleGame.add(rules);
    puzzleGame.setTitle("The puzzle game");
    puzzleGame.setLayout(null);
    puzzleGame.setSize(1380 ,1400);
    puzzleGame.setVisible(true);
    puzzleGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  }//end main

  public static void MazeGame() // maze game public 
  {// beginning of the MAze game to put the jframe 
    // the main jframe for the mazeGAme 
    JFrame Mazeboard = new JFrame();
   
    Mazeboard.setTitle("The Maze Runner Game");
    Mazeboard.add(new Board()); // adding the borad to jframe
    Mazeboard.setSize(1380, 1400);
    Mazeboard.setVisible(true);
    Mazeboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  } // end of jframe 
   public JFrame getMaze() // this will call grass from boread clss
  {
    return Mazeboard;
  }
   
} // end of class
