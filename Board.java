import javax.swing.*;                                                             
import java.awt.*;

public class Board {
        JPanel panel = new JPanel(); //makes a new panel
        GridLayout layout = new GridLayout(8,8,1,1); // makes it have a grid layout 8 by 8
        JFrame frame = new JFrame();  // makes a new frame 
        Square[][] squareArray = new Square[8][8];// can create an 2D array when called 
        
public Board()
    {
        
       
        frame.setContentPane(panel); 
        frame.setTitle("Draught Game");
        frame.setSize(750,750); // makes the size 750 by 750 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(layout); // sets the layoutout to the 8 by 8 when called 

        for(int i=0;i<8;i++){
         for(int j = 0 ;j < 8;j++)
        {
            squareArray[j][i] = new Square(); // a for loop to fill the array with squares  
            if ((i+j) % 2 == 0 )
          {
            squareArray[j][i].setColour("BLACK");
            panel.add(squareArray[j][i].addButton(false));
          }
          else 
          {
            squareArray[j][i].setColour("WHITE");
            panel.add(squareArray[j][i].addButton(i<8 && i>4));
            
          }
        
            
          
          
        }
        frame.setVisible(true); // make the panel visible 

            
    }
    
}
}


