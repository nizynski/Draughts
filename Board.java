// File:Class.java
import javax.swing.*;                                                             
import java.awt.*;
import java.awt.event.*;
/**
 * This is a Class which creates a 8 by 8 black and white checked board using a 2D array.
 * 
 * @author Katie Nizynski
 */

public class Board implements ActionListener 
{
        JPanel panel = new JPanel(); //Is used to create a new Jpanel when panel is called
        GridLayout layout = new GridLayout(8,8,1,1); // Is used to create a grid Layot with the dimensions ..
        JFrame frame = new JFrame();  // Is used to create a new Jframe when Frame is called 
        Square[][] squareArray = new Square[8][8];// When square array is called it creates a 2D array storing 8 by 8
        Square square = new Square();
        private static JButton secondSquare;
        private int clicks = 0;
        private int clickedX = -1;
        private int clickedY = -1;

 public void actionPerformed(ActionEvent event)
    {
      if(clicks == 0) // search for a counter
      {
        for(int x = 0; x < 8;x++) {// checking 
           for(int y=0;y<8;y++) {// checking 
             if(squareArray[x][y].getButton() == event.getSource()) {//searches the array to compare the source which has been found with elements of the array to find a sqaure 
              clickedX = x;// saves x coordinate which is a given in sqaure class to instance variable clickedX 
              clickedY = y;//saves y coordinate which is give in sqaure class to instance variable clickedY
             }
           }
        }
        clicks++ ; // incrementation of loop so that it saves more than one click
      }
      else if(clicks == 1)// search for a white square
      {
        for(int x = 0; x < 8;x++) 
        {
           for(int y=0;y < 8;y++) 
           {
             if(squareArray[x][y].getButton() == event.getSource()) 
            {
               squareArray[clickedX][clickedY].moveTo(squareArray[x][y]); 
             clicks = 0;// sets the instance varaible back to 0 so that it works with the next click
            }

           }
        }
      }
    }

        
public Board()
    {
        
       
        frame.setContentPane(panel); //sets a panel for the game 
        frame.setTitle("Draught Game");// adds a titile to the game which shows "Draught Game"
        frame.setSize(750,750); // Sets the size 750 by 750 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Exit the application
        panel.setLayout(layout); // sets the layout for the game as the grid set earlier

        for(int i=0;i<8;i++){
         for(int j = 0 ;j < 8;j++)
        {
            squareArray[j][i] = new Square(); // A for loop to set the sqaures in the array 
            if ((i+j) % 2 == 0 )// A calculation which finds the numbers in the array of every other square
          {
            squareArray[j][i].setColour("BLACK");// sets the squares found using the if statement to black
            panel.add(squareArray[j][i].addButton(false));//adds the now black squares to the panel
          }
          else // else statement to fill the squares that dont fit the criteria of the if
          {
            squareArray[j][i].setColour("WHITE");// sets the squares to white
            panel.add(squareArray[j][i].addButton(i<8 && i>4));// adds the now white squares to the panel and white counters to rows less than 8 and more than 4 
            squareArray[j][i].getButton().addActionListener(this); // places in action listener on all white squares so they can be selected
          }
        }
        frame.setVisible(true); // makes the panel visible 

            
    }
    
}
}


