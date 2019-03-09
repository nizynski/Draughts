import javax.swing.*;                                                             
import java.awt.*;

public class Board {
        JPanel panel = new JPanel(); //makes a new panel
        GridLayout layout = new GridLayout(8,8); // makes it have a grid layout 8 by 8
        JFrame frame = new JFrame();  // makes a new frame 
        Square[] squareArray = new Square[64];// can create an array when called 
        
public Board()
    {
        
        
        frame.setContentPane(panel); 
        frame.setTitle("Draught Game");
        frame.setSize(500,500); // makes the size 500 by 500 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(layout); // sets the layoutout to the 8 by 8 when called 
        for(int i = 0 ;i < 64;i++)
        {
            squareArray[i] = new Square(); // a for loop to fill the array with squares  
        }
        for (int i = 0; i < 64;i++)
        
        {
          if (i % 2 == 0 )
          {
            squareArray[i].setColour("BLACK");
            panel.add(squareArray[i].addButton());
          }
          else 
          {
            squareArray[i].setColour("WHITE");
            panel.add(squareArray[i].addButton());
          }
        
            
          
          
        }
        frame.setVisible(true); // make the panel visible 

            
    }
    
}


